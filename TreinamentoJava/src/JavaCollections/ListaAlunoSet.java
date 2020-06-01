package JavaCollections;

import java.util.*;

public class ListaAlunoSet {

	public static void main(String[] args) {
		
		Set<Aluno> conjunto = new HashSet<Aluno>();
		
		Aluno a = new Aluno("Carlos Ferreira", "Java básico", 0);
		Aluno b = new Aluno("Melanie Miranda","React", 0);
		Aluno c = new Aluno("Gabriel Fernando","Java Avançado", 0);
		Aluno d = new Aluno("Melanie Miranda","React", 0);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		
		System.out.println(conjunto);
		
		for(Aluno aluno : conjunto)
		{
			System.out.println(aluno);
		}

	}

}
