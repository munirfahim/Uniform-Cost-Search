/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucs;

/**
 *
 * @author munir
 */
public class Node {
    public final String value;
	public double pathCost;
	public Edge[] adjacencies;
	public Node parent;

	public Node(String val){

		value = val;
		
	}

	public String toString(){
		return value;
	}

}

class Edge{
	public final double cost;
	public final Node target;

	public Edge(Node targetNode, double costVal){
		cost = costVal;
		target = targetNode;

	}
}
