package JavaCollections;

import java.util.*;

public class ListaAlunoMap {

	public static void main(String[] args) {
		//O primeiro  refere-se à chave e o segundo ao valor
		Map<String, Aluno> mapa = new TreeMap<String, Aluno>();
		//Garante que as chaves estarão em ordem ascendente.
		
		Aluno a = new Aluno("Carlos Ferreira", "Java básico", 0);
		Aluno b = new Aluno("Maria Souza","Python", 0);
		Aluno c = new Aluno("Gabriel Fernando","Java", 0);
		Aluno d = new Aluno("Melanie Miranda","React", 0);
		
		mapa.put("Carlos Ferreira", a); //Método pra inserir na estrutura
		mapa.put("Maria Souza", b);
		mapa.put("Gabriel Fernando", c);
		mapa.put("Melanie Miranda", d);
		
		System.out.println(mapa);
		
		System.out.println(mapa.get("Melanie Miranda"));//Recupera m valor especifico
		System.out.println("Fim da busca \n");
		
		
		Collection<Aluno> alunos = mapa.values();
		//Retorna um *Collection* com os valores associados as Chaves
		
		for (Aluno e: alunos)
		{
			System.out.println("---------------------------");
			System.out.println(e);
		}
		

	}

}
