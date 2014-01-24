package uni.softcomputing.basicobjects;

import java.util.Comparator;
import java.util.List;

//import uni.softcomputing.basicobjects.FuzzyCost.Comparators;

public class Edge implements Comparable<Edge>{

//	Node beginNode = null;
	
	Node endNode = null;
	
	// lower capacity
	double lowerCapacity = 0.0;
	
	// upper capacity
	double upperCapacity = 0.0;
	
	// real value
	double capacity = 0.0;
	
	// the priority of k_th element is more than k+1_th element
	FuzzyCost fuzzyCost = null;
	

	public Edge(Node endNode, double lowerCapacity,
			double upperCapacity, FuzzyCost fuzzyCost) {
		super();
//		this.beginNode = beginNode;
		this.endNode = endNode;
		this.lowerCapacity = lowerCapacity;
		this.upperCapacity = upperCapacity;
		this.fuzzyCost = fuzzyCost;
	}
	
//	public Node getBeginNode() {
//		return beginNode;
//	}
//
//	public void setBeginNode(Node beginNode) {
//		this.beginNode = beginNode;
//	}
	
	public Node getEndNode() {
		return endNode;
	}

	public void setEndNode(Node endNode) {
		this.endNode = endNode;
	}

	public double getLowerCapacity() {
		return lowerCapacity;
	}

	public void setLowerCapacity(double lowerCapacity) {
		this.lowerCapacity = lowerCapacity;
	}

	public double getUpperCapacity() {
		return upperCapacity;
	}

	public void setUpperCapacity(double upperCapacity) {
		this.upperCapacity = upperCapacity;
	}

	public FuzzyCost getFuzzyCost() {
		return fuzzyCost;
	}

	public void setFuzzyCost(FuzzyCost fuzzyCost) {
		this.fuzzyCost = fuzzyCost;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		
		if(capacity < this.lowerCapacity)
			this.capacity = this.lowerCapacity;
		
		else if(capacity > this.upperCapacity)
			this.capacity = this.upperCapacity;
		
		else
			this.capacity = capacity;
	}
	
	@Override
	public int compareTo(Edge o) {
		return Comparators.PRIORITY.compare(this, o);
	}
	
	public static class Comparators {

      public static Comparator<Edge> PRIORITY = new Comparator<Edge>() {
          @Override
          public int compare(Edge o1, Edge o2) {
//          	int result = o1.fuzzyCost.priority.compareTo(o2.fuzzyCost.priority);
          	int result = 0;
          	return result;
          }
      };
	}
}
