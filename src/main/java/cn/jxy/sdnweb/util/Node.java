package cn.jxy.sdnweb.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * 
 * 节点类
 *
 */

public class Node implements Serializable{
	private String name;
	private int x;
	private int y;
	public List<Node> relationNodes = new ArrayList<Node>();  
	
	public Node() {
		super();
	}
	public Node(String name, int x, int y) {
		super();
		this.name = name;
		this.x = x;
		this.y = y;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	public List<Node> getRelationNodes() {
		return relationNodes;
	}
	@JsonBackReference
	public void setRelationNodes(List<Node> relationNodes) {
		this.relationNodes = relationNodes;
	}
	@Override
	public String toString() {
		return "Node [name=" + name + ", x=" + x + ", y=" + y +"]";
	}
	
}
