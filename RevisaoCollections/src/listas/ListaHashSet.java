package listas;

import java.util.HashSet;
import java.util.Set;

import classe.Pais;

public class ListaHashSet {

	public static void main(String[] args) {
		// O SET n�o permite repeti��o
		
		//Instanciando a Classe Pais - Observar que n�o h� repeti��o
		Pais a = new Pais("Brasil",10000);
		Pais b = new Pais("Portugal",8000);
		Pais c = new Pais("Brasil",10000);
		Pais d = new Pais("Brasil",10000);
		Pais e = new Pais("Brasil",10000);
		Pais f = new Pais("Brasil",10000);
		
		//Instanciando a Classe SET
		Set<Pais> paisSet = new HashSet<Pais>();
		
		//Popular o Hashset
		paisSet.add(a);
		paisSet.add(b);
		paisSet.add(c);
		paisSet.add(d);
		paisSet.add(e);
		paisSet.add(f);
		
		//imprimindo
		for(Pais pais : paisSet)
			//Para cada pais dentro do conjunto PaisSet
		{
			System.out.print("Pa�s: "+pais.getNomePais());
			System.out.print(" - ");
			System.out.println("Popula��o: "+pais.getPopulacao());
		}

	}

}
