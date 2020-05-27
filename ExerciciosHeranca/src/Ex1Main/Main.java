package Ex1Main;

import java.util.Scanner;

import Ex1Model.Ex1Aeronave;

public class Main {

	public static void main(String[] args) {
		
		String nome = "";
		
		
		Ex1Aeronave aviao = new Ex1Aeronave();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com o nome do Avião: ");
		nome = entrada.next();
		
		aviao.setNome(nome);
		
		System.out.print("Qual o modelo do Avião? ");
		nome = entrada.next();
		aviao.setModelo(nome);
		
		aviao.setAsa(true);
		
		aviao.voar();
		
		
		
		
		

	}

}
