package application;

import java.util.ArrayList;
import java.util.List;

public class Vertix {//implements Comparable<Node>{
	private String name;
	private double longitude;
	private double Latitude;
	private List<Edge> adjEdgeList=new ArrayList<>();
	
	public Vertix(String name, double longitude, double latitude) {
		this.name = name;
		this.longitude = longitude;
		Latitude = latitude;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return Latitude;
	}
	public void setLatitude(double latitude) {
		Latitude = latitude;
	}
	public void addEdge(Edge edge) {
		this.adjEdgeList.add(edge);
	}
	
	
	
	public List<Edge> getAdjEdgeList() {
		return adjEdgeList;
	}
	public void setAdjEdgeList(List<Edge> adjEdgeList) {
		this.adjEdgeList = adjEdgeList;
	}
	@Override
	public String toString() {
		return "name=" + name + ", longitude=" + longitude + ", Latitude=" + Latitude;
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof Vertix ) {
			if(this.name==((Vertix)o).name) {
				return true;
			}else {
				return false;
			}
		}
		return false;
		
		
	}
	
	
	

}
