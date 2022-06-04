package br.ucsal;



public class Arvore {

	public No root;
	private int tamanho =0;
	
	private static int COUNT = 10;
	
	public Arvore() {
		root = null; 
	}
	
	public boolean insert(int data) {
		
		No temp = root;
		
		No newNo = new No(data);
		
		if(root == null) {
			root = newNo;
			tamanho++;
			return true;
		}
		
		while(temp != null) {
			
			newNo.origin = temp;
			
			if( data == temp.data) {
				return false;
			}else if(data < temp.data){
				temp = temp.left;
				if(temp == null) {
					newNo.origin.left =newNo;
					tamanho++;
					return true;
				}
			}else {
				temp = temp.right;
				if(temp == null) {
					newNo.origin.right = newNo;
					tamanho++;
					return true;
				}
				
			}
			
			
			
		}
		
		return false;
		
	}
	
	public boolean inserirDireita(int data) {
			
			No temp = root;
			
			No newNo = new No(data);
			
			if(root == null) {
				root = newNo;
				return true;
			}
			
			while(temp != null) {
				newNo.origin = temp;
				temp = temp.right;
				if(temp == null) {
						newNo.origin.right = newNo;
						return true;
					}
			}
			
			return false;
			
		}
	
	public boolean inserirEquerda(int data) {
		
		No temp = root;
		
		No newNo = new No(data);
		
		if(root == null) {
			root = newNo;
			return true;
		}
		
		while(temp != null) {
			newNo.origin = temp;
			temp = temp.left;
			if(temp == null) {
					newNo.origin.left = newNo;
					return true;
				}
		}
		
		return false;
		
	}

	public boolean removerDireita() {
		
		No temp = root;
		
		if(root == null) {
			tamanho = 0;
			return true;
		}
		
		while(temp != null) {
			temp = temp.right;
			if(temp.right == null) {
					temp.origin.right = null;
					tamanho--;
					return true;
				}
		}
		
		return false;
		
	}

	public boolean removerEsquerda() {
			
			No temp = root;
			
			if(root == null) {
				tamanho = 0;
				return true;
			}
			
			while(temp != null) {
				temp = temp.left;
				if(temp.left == null) {
						temp.origin.left = null;
						tamanho--;
						return true;
					}
			}
			
			return false;
			
		}

	public int tamanho(No root, int nivel) {
		
		if (root == null)
	        return nivel;
		
		nivel +=1;
		
		int right = tamanho(root.right,nivel);
		int left = tamanho(root.left,nivel);
		
		return Math.max(right, left);
	}
	
	public int tamanho() {
	  return tamanho(root,0);
	}
	
	public void retornarEsquerda() {
		
		retornarArvore(root.left);
			
	}
	

	public void retornarDireita() {
		retornarArvore(root.right);
		
	}
	
	
	public void retornarArvore(No root)
	{
	    if (root == null)
	        return;


	    retornarArvore(root.right);

	    System.out.print(root.data + " ");
	 
	    retornarArvore(root.left);
	}
	
	public void retornarArvore() {
		retornarArvore(root);
	}
	
	
	public void toString(No root,int space) {
		if (root == null)
	        return;
		
			space += COUNT;
		
		 	toString(root.right, space);
		 
		    System.out.print("\n");
		    for (int i = COUNT; i < space; i++)
		        System.out.print(" ");
		    System.out.print(root.data + "\n");

		    toString(root.left, space);
	}
	
	public String toString() {
		
		toString(root,0);
		
		return"";
	}
	 
	
	
}
