package listas;

import java .util.*;

public class ListaArrayListSimples {
	
	//N�o foi utilizada nenhuma classe criada por n�s

	public static void main(String[] args) {
		//Nome dos paises - observe que n�o informo o tamanho do Array
		
		//Instanciando a classe do Arraylist
		ArrayList<String> paises = new ArrayList<>();
		
		//Adicionando informa��o
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
		paises.add("�frica do Sul");
		
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
