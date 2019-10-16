package com.ask.java.ds;

public class NodeTest {

	public static void main(String[] args) {
		Node head = setDS();//To set data in node
		printNodes(head);//To print data of nodes
		Node swapped = checkNode(head);
		printNodes(swapped);
	}

	private static Node checkNode(Node head) {
		int n = 3;
		int i = 0;
		System.out.println();
		while(i < n) {
			Node tailNode = getTailNode(head);
			shiftNode(head, tailNode);
			i++;
		}
		return head;
	}
	
	private static void shiftNode(Node head, Node tailNode) {
		while(head.getNext() != null) {
			Node tempNode = new Node();
			tempNode.setName(head.getName());
			tempNode.setNext(head.getNext());
			head.setName(tailNode.getName());
			head = head.getNext();
			tailNode = tempNode;
			if(head.getNext() == null) {
				head.setName(tailNode.getName());
			}
		}
	}
	
	private static Node getTailNode(Node head) {
		Node tailNode = head;
		while(head.getNext() != null) {
			head = head.getNext();
			tailNode = head;
		}
		return tailNode;
	}
	
	private static void printNodes(Node head) {
		System.out.print("Node = "+head.getName());
		while(head.getNext() != null) {
			head = head.getNext();
			System.out.print(" , "+head.getName());
		}
	}
	
	private static Node setDS() {
		Node node = new Node();
		node.setName("A_01");
		Node node2 = new Node();
		node2.setName("B_02");
		
		Node node3 = new Node();
		node3.setName("C_03");
		
		Node node4 = new Node();
		node4.setName("D_04");
		
		Node node5 = new Node();
		node5.setName("E_05");
		
		Node node6 = new Node();
		node6.setName("F_06");
		
		node6.setNext(null);
		node5.setNext(node6);
		node4.setNext(node5);
		node3.setNext(node4);
		node2.setNext(node3);
		node.setNext(node2);
		return node;
	}
}

class Node{
	String name;
	Node next;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}
