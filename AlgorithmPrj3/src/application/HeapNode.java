package application;

public class HeapNode implements Comparable<HeapNode>{
	Vertix vertex;
	double distance;
	boolean isTrue;
	
	
	public HeapNode(Vertix vertex, double d) {
		super();
		this.vertex = vertex;
		this.distance = d;
	}
	public HeapNode(Vertix vertex, int distance, boolean isTrue) {
		super();
		this.vertex = vertex;
		this.distance = distance;
		this.isTrue = isTrue;
	}
	public Vertix getVertex() {
		return vertex;
	}
	public void setVertex(Vertix vertex) {
		this.vertex = vertex;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public boolean isTrue() {
		return isTrue;
	}
	public void setTrue(boolean isTrue) {
		this.isTrue = isTrue;
	}
	@Override
	public int compareTo(HeapNode b) {
		if(this.distance>b.distance ) {
			return 1;
		}else{
			return -1;
		}
	}
	
	

}
