package com.ask.java.algos;

public class BST {

	static class Node {
		int key;
		Node left, right;
	};

	static Node newNode(int data) {
		Node node = new Node();
		node.key = data;
		node.left = null;
		node.right = null;
		return node;
	}

	static Node insert(Node root, int key) {
		if (root != null) {
			if (root.key > key) {
				if (root.right == null)
					root.right = newNode(key);
				else
					insert(root.right, key);
			} else {
				if (root.left == null)
					root.left = newNode(key);
				else
					insert(root.left, key);
			}
		} else {
			root = newNode(key);
		}
		return root;
	}

	static void Inorder(Node root)  
	{  
	    if (root == null)  
	        return;  
	    else {  
	        Inorder(root.right);  
	        System.out.print( root.key +" ");  
	        Inorder(root.left);  
	    }  
	}
	
	public static void main(String[] args) {
	    Node root = null;  
	    root = insert(root, 50);  
	    insert(root, 30);  
	    insert(root, 20);  
	    insert(root, 40);  
	    insert(root, 70);  
	    insert(root, 60);  
	    insert(root, 80);  
	    
	    // Print inoder traversal of the BST  
	    Inorder(root);  
	}

}
