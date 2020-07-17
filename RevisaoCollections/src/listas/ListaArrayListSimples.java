package listas;

import java .util.*;

public class ListaArrayListSimples {
	
	//Não foi utilizada nenhuma classe criada por nós

	public static void main(String[] args) {
		//Nome dos paises - observe que não informo o tamanho do Array
		
		//Instanciando a classe do Arraylist
		ArrayList<String> paises = new ArrayList<>();
		
		//Adicionando informação
		paises.add("Brasil");
		paises.add("Portugal");
		paises.add("Espanha");
		
		//Imprimindo o ArrayList
		for (int i=0; i<paises.size(); i++)
		{
			System.out.println("Pais: "+paises.get(i));
		}
		
		System.out.println("---------------");
		
		//acrescentar paises
		paises.add("Argentina");
		paises.add("África do Sul");
		
		//Imprimindo o ArrayList
		for (int i=0; i<paises.size(); i++)
		{
			System.out.println("Pais: "+paises.get(i));
		}
		
		System.out.println("---------------");
		
		//remover itens da Lista
		paises.remove(0); //remove o Brasil
		paises.remove("Argentina"); //remove a Arehntina pelo item
		
		//Imprimindo o ArrayList
		for (int i=0; i<paises.size(); i++)
		{
			System.out.println("Pais: "+paises.get(i));
		}
				
		System.out.println("---------------");
		

	}

}
