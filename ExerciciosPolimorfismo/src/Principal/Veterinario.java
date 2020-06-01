package Principal;

import Model.*;

public class Veterinario {

	public static void main(String[] args) {
		
		Cachorro cachorro1 = new Cachorro();
		Cavalo cavalo1 = new Cavalo();
		Preguica preguica1 = new Preguica();
		
		cachorro1.latir();
		cachorro1.atendimentoVet();
		System.out.println("-----------");
		cavalo1.relinchar();
		cavalo1.atendimentoVet();
		System.out.println("-----------");
		preguica1.fazerSom();
		preguica1.atendimentoVet();
		

	}

}
