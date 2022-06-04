package br.ucsal;

public class Main {

	public static void main(String[] args) {
		
		Arvore arvore = new Arvore();
		int [] data = {5,7,2,1,8,9,3,0};
		 
		for (int value : data) {
			 arvore.insert(value);
		}
		
		

		arvore.retornarEsquerda();
		
		System.out.println("");
		System.out.println("altura: " + arvore.tamanho());
		System.out.println(arvore);

	}

}
