package br.ucsal;
import java.util.Stack;
public class Teste {


	// Function to print binary tree in 2D
	// It does reverse inorder traversal

	 
	// Driver code
	public static void main(String args[])
	{
	    No root = new No(1);
	    root.left = new No(2);
	    root.right = new No(3);
	 
	    root.left.left = new No(4);
	    root.left.right = new No(5);
	    root.right.left = new No(6);
	    root.right.right = new No(7);
	 
	    root.left.left.left = new No(8);
	    root.left.left.right = new No(9);
	    root.left.right.left = new No(10);
	    root.left.right.right = new No(11);
	    root.right.left.left = new No(12);
	    root.right.left.right = new No(13);
	    root.right.right.left = new No(14);
	    root.right.right.right = new No(15);
	     

	}
	

}
