package br.ucsal;

public class No {

	public No origin;
	public No left;
	public No right;
	public int data;
	
	public No(int data) {
		origin = null;
		left = null;
		right = null;
		this.data = data;
	}
	
	public boolean isFolha() {
		
		return left == null && right == null? true: false;
		
	}
	
	@Override
	public String toString() {
		return "No [data=" + data + "]";
	}

}
