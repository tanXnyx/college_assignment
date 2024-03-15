import java.util.*; 

class Edge { 
    int dest;
    int cost;
    
    public Edge(int dest, int cost) {
        this.dest = dest;
        this.cost = cost;
    }
}

class EdgeComparator implements Comparator<Edge> {
    public int compare(Edge e1, Edge e2) {
        return e1.cost - e2.cost;
    }
}

class Graph {
    int count;
    HashMap<Integer, LinkedList<Edge>> Adj;
    
    public Graph(int count) {
        this.count = count;
        Adj = new HashMap<>();
        for (int i = 0; i < count; i++) {
            Adj.put(i, new LinkedList<Edge>());
        }
    }
    
    public void addEdge(int source, int dest, int cost) {
        LinkedList<Edge> adl = Adj.get(source);
        adl.add(new Edge(dest, cost));
        Adj.put(source, adl);
    }
}

public class PrimAlgorithm {
    public static void prims(Graph gph) {
        int[] previous = new int[gph.count];
        int[] dist = new int[gph.count];
        boolean[] visited = new boolean[gph.count];
        int source = 1;
        
        for (int i = 0; i < gph.count; i++) {
            previous[i] = -1;
            dist[i] = 999999; // infinite
        }
        dist[source] = 0;
        previous[source] = -1;
        
        EdgeComparator comp = new EdgeComparator();
        PriorityQueue<Edge> queue = new PriorityQueue<Edge>(100, comp);
        Edge node = new Edge(source, 0);
        queue.add(node);
        
        while (!queue.isEmpty()) {
            node = queue.peek();
            queue.remove();
            visited[source] = true;
            source = node.dest;
            LinkedList<Edge> adl = gph.Adj.get(source);
            for (Edge adn : adl) {
                int dest = adn.dest;
                int alt = adn.cost;
                if (dist[dest] > alt && !visited[dest]) {
                    dist[dest] = alt;
                    previous[dest] = source;
                    node = new Edge(dest, alt);
                    queue.add(node);
                }
            }
        }
        
        // printing result.
        int count = gph.count;
        for (int i = 0; i < count; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                System.out.println(" node id " + i + " prev " + previous[i] + " distance : Unreachable");
            } else {
                System.out.println(" node id " + i + " prev " + previous[i] + " distance : " + dist[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        // Example usage
        Graph graph = new Graph(5); // Creating a graph with 5 nodes
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 8);
        graph.addEdge(1, 2, 2);
        graph.addEdge(2, 3, 3);
        graph.addEdge(2, 4, 5);
        
        prims(graph);
    }
}

