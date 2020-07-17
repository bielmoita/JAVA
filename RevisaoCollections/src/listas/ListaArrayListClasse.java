package listas;

import java.util.ArrayList;
import java.util.Iterator; //percorre todo o ArrayList

import classe.Pais;

public class ListaArrayListClasse {

	public static void main(String[] args) {
		// Neste caso vamos utilizar o Classe Pais
		
		//Instanciando a Classe Pais
		Pais a = new Pais("Brasil",9000);
		Pais b = new Pais("Portugal",1000);
		Pais c = new Pais("França",500);
		Pais d = new Pais("Dinamarca",1000);
		Pais e = new Pais("Argentina",900);
		Pais f = new Pais("Estados Unidos",10000);
		
		// Instanciando a Classe ArrayList
		ArrayList<Pais> paises = new ArrayList<>();
		
		//Popular o Arraylist
		paises.add(a);
		paises.add(b);
		paises.add(c);
		paises.add(d);
		paises.add(e);
		paises.add(f);
		
		//Percorrer a Coleção - dos paises que instanciei
		Pais pais;
		
		//Instanciando a classe Iterator
		Iterator<Pais> itr = paises.iterator();
		
		while(itr.hasNext())
		{
			//itr.hasNext = retorna true se houver mais linha
			pais = itr.next(); //Pega valor da linha ( Arraylist)
			//E armazena na variavel pais
			System.out.print("País: "+pais.getNomePais());
			System.out.print(" - ");
			System.out.println("Populacao: "+pais.getPopulacao());
			
		}
		
		
		
		
		
		
		

	}

}
