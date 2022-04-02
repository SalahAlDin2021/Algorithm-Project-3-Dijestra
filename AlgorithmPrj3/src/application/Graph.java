package application;

import java.util.ArrayList;
import java.util.PriorityQueue;


public class Graph {
	private ArrayList<Vertix> vertices =new ArrayList<>();
	int size ;
	public void addVertix(String name, double d,double e) {
		addVetrix(new Vertix(name, d, e) );
	}
	private void addVetrix(Vertix v){
		vertices.add(v);
		size++;
	}
	public void addEdge(String v1,String v2){
		Vertix v=find(v1),w=find(v2);
		addEdge(v,w);
	}
	private void addEdge(Vertix v,Vertix w){
		if(v!=null && w!=null) {
			Edge edge = new Edge(v, w);
			v.addEdge(edge);	
		}
	}
	
	private Vertix find(String n1) {
		for(int i=0;i<size;i++) {
			if(vertices.get(i).equals(n1)) {
				return vertices.get(i);
			}
		}
		return null;
	}
	
	public void dijkstra_GetMinDistances(Vertix source , Vertix dest){
		PriorityQueue<HeapNode> minHeap = new PriorityQueue<>();
		int[] dist=new int[size];
		
		for(int i=0;i<source.getAdjEdgeList().size();i++) {
			minHeap.add(new HeapNode(source.getAdjEdgeList().get(i).getDist(),source.getAdjEdgeList().get(i).getCost()));
		}
		ArrayList<HeapNode> results=new ArrayList<HeapNode>();
		while(!minHeap.isEmpty()) {
			HeapNode min = minHeap.poll();
			for(int i=0;i<min.getVertex().getAdjEdgeList().size();i++) {
				double distance = min.vertex.getAdjEdgeList().get(i).getCost()+min.distance ;
				Vertix v= min.vertex.getAdjEdgeList().get(i).getDist();
				if(!minHeap.contains(new HeapNode(v,distance)))
				minHeap.add(new HeapNode(v,distance));
			}
			results.add(min);
		}
		
		
	}
		/* int INFINITY = Integer.MAX_VALUE;
		 boolean[] SPT = new boolean[size];

		// //create heapNode for all the vertices
		 HeapNode [] heapNodes = new HeapNode[size];
		 for (int i = 0; i <size ; i++) {
		 heapNodes[i] = new HeapNode();
		 heapNodes[i].vertex = i;
		 heapNodes[i].distance = INFINITY;
		 }

		 //decrease the distance for the first index
		 heapNodes[sourceVertex].distance = 0;

		 //add all the vertices to the MinHeap
		 MinHeap minHeap = new MinHeap(size);
		 for (int i = 0; i <size ; i++) {
		 minHeap.insert(heapNodes[i]);
		 }
		 //while minHeap is not empty
		 while(!minHeap.isEmpty()){
		 //extract the min
		 HeapNode extractedNode = minHeap.extractMin();

		 //extracted vertex
		 int extractedVertex = extractedNode.vertex;
		 SPT[extractedVertex] = true;

		 //iterate through all the adjacent vertices
		 LinkedList<Edge> list = adjacencylist[extractedVertex];
		 for (int i = 0; i <list.size() ; i++) {
		 Edge edge = list.get(i);
		 int destination = edge.destination;
		 //only if destination vertex is not present in SPT
		 if(SPT[destination]==false ) {
		 ///check if distance needs an update or not
		 //means check total weight from source to vertex_V is less than
		 //the current distance value, if yes then update the distance
		 int newKey = heapNodes[extractedVertex].distance + edge.weight ;
		 int currentKey = heapNodes[destination].distance;
		 if(currentKey>newKey){
		 decreaseKey(minHeap, newKey, destination);
		 heapNodes[destination].distance = newKey;
		 }
		 }
		 }
		 }
	}/*
		 //print SPT
		 printDijkstra(heapNodes, sourceVertex);
		 }

		 public void decreaseKey(MinHeap minHeap, int newKey, int vertex){

		 //get the index which distance's needs a decrease;
		 int index = minHeap.indexes[vertex];

		 //get the node and update its value
		 HeapNode node = minHeap.mH[index];
		 node.distance = newKey;
		 minHeap.bubbleUp(index);
		 }

		 public void printDijkstra(HeapNode[] resultSet, int sourceVertex){
		 System.out.println("Dijkstra Algorithm: (Adjacency List + Min Heap)");
		 for (int i = 0; i <vertices ; i++) {
		 System.out.println("Source Vertex: " + sourceVertex + " to vertex " + + i +
		 " distance: " + resultSet[i].distance);
		 }
		 }
		 }*/
	

}
