import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    
    private ArrayList<ArrayList<Edge>> adj = new ArrayList<ArrayList<Edge>>();
    private boolean[] visited;
    private int[] distance;
    private Queue<Integer> queue;

    public class Edge {
        int dest, weight;

        public Edge(int dest, int weight){
            this.dest = dest;
            this.weight = weight;
        }

        public int getDest(){
            return this.dest;
        }

        public int getWeight(){
            return this.weight;
        }
    }

    public Graph(int N) {
        for(int i = 0; i < N; i++){
            adj.add(new ArrayList<Edge>());
        }
        visited = new boolean[N];
        distance = new int[N];
        queue = new LinkedList<>();
    }

    // Method utama addEdge
    public void addEdge(int source, int dest, int weight, boolean directed){
        ArrayList<Edge> adjU = (ArrayList<Edge>) adj.get(source);
        adjU.add(new Edge(dest, weight));
        if(!directed){
            ArrayList<Edge> adjV = (ArrayList<Edge>) adj.get(dest);
            adjV.add(new Edge(source, weight));
        }
    }

    // Untuk unweighted directed graph
    public void addEdge(int u, int v, boolean directed){ 
        this.addEdge(u, v, 1, directed);
    }

    // Untuk unweighted graph
    public void addEdge(int u, int v){ 
        this.addEdge(u, v, 1, false);
    }

    public void draw(){
        for(int i = 0; i < adj.size(); i++){
            System.out.print(i + " : ");
            ArrayList<Edge> adjacent = (ArrayList<Edge>) adj.get(i);
            for(int j = 0; j < adjacent.size(); j++){
                Edge v = (Edge) adjacent.get(j);
                System.out.print("(" + v.dest + ", " + v.weight + ") ");
            }
            System.out.println();
        }
    }

    private boolean clearVisit(){
        for(int i = 0; i < adj.size(); i++){
            visited[i] = false;
        }
        return false;
    }

    private void dfs(int nodeIdx){
        visited[nodeIdx] = true;
        ArrayList<Edge> adjacent = (ArrayList<Edge>) adj.get(nodeIdx);
        for(int i = 0; i < adjacent.size(); i++){
            int dest = ((Edge) adjacent.get(i)).getDest();
            if(!visited[dest]){
                dfs(dest);
            }
        }
    }

    public int countCC(){
        clearVisit();
        int counter = 0;
        for(int i = 0; i < adj.size(); i++){
            if(!visited[i]){
                counter++;
                dfs(i);
            }
        }
        return counter;
    }

    // Metode untuk menghitung jarak terpendek dari sumber ke semua node lain menggunakan BFS
    public void distance(int source) {
        clearVisit();
        for(int i = 0; i < distance.length; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        distance[source] = 0;
        queue.add(source);
        visited[source] = true;

        while(!queue.isEmpty()) {
            int node = queue.poll();
            ArrayList<Edge> adjacent = adj.get(node);
            for(Edge edge : adjacent) {
                int dest = edge.getDest();
                if(!visited[dest]) {
                    visited[dest] = true;
                    distance[dest] = distance[node] + edge.getWeight();
                    queue.add(dest);
                }
            }
        }
    }

    // Metode untuk mendapatkan jarak dari node source ke node dest
    public int getDist(int source, int dest) {
        // Hitung jarak dari source
        distance(source);
        // Kembalikan jarak ke dest
        return distance[dest];
    }

    public static void main(String[] args) {
        Graph myGraph = new Graph(6);
        myGraph.addEdge(0, 1);
        myGraph.addEdge(1, 2);
        myGraph.addEdge(2, 3);
        myGraph.addEdge(3, 4);
        myGraph.addEdge(4, 5);
        myGraph.addEdge(0, 5);

        System.out.println("jarak 2 ke 5 = " + myGraph.getDist(2, 5));
    }
}
