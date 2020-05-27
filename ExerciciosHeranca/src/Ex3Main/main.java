package Ex3Main;

import java.util.Scanner;

import Ex3Model.Veiculo;

public class main {

	public static void main(String[] args) {
		//Variaveis
		String dado = "";
		int veloc = 0, opcao;
		boolean erro = true;// Determina finalizar o doWhile
		
		//Entrada de dados
		Scanner entrada = new Scanner(System.in);
		
		Veiculo veiculo1 = new Veiculo();
		
		System.out.print("Qual o nome do seu veiculo? ");
		dado = entrada.next();
		veiculo1.setNome(dado);
		
		System.out.print("Qual o tipo do seu veiculo? ");
		dado = entrada.next();
		veiculo1.setTipo(dado);
		
		
		
		do {
			try {
				System.out.println("O que deseja fazer?");
		        System.out.println("( 1 ) - Acelerar o "+veiculo1.getTipo());
		        System.out.println("( 2 ) - Desacelerar o "+veiculo1.getTipo());
		        System.out.println("( 3 ) - Fazer curva com "+veiculo1.getTipo());
		        System.out.println("( 0 ) - Sair do Programa a qualquer momento");
		        
		        
		        System.out.printf("Digite uma opcão: ");
		        opcao = Integer.parseInt(entrada.nextLine());
		        System.out.println("A opçao escolhida foi: "+ opcao+"\n");
		        
		        if(opcao == 0) {
		        	System.out.println("\nO programa será finalizado");
		            erro = false;
		        }
		        
		        if(opcao == 1) {
		        	
		        	veiculo1.acelerar();
		        	
		        }
		        if(opcao == 2) {
		        	
		        	veiculo1.frear();
		        }
		        if(opcao == 3) {
		        	if (veiculo1.getVelocidade() >=70) {
		        		System.out.println("O seu veiculo capotou, ligue para emergencia");
		        		opcao = 0;
		        	}
		        	else {
		        		System.out.println("Seu veiculo fez a curva com sucesso!");
	        		
		        		}
		        
		        	}
		        
			}
			catch(NumberFormatException e) {
				System.out.println("Da opção 0");
			    opcao = 0;
			}			
	} while (erro);
		//return opcao;
	
	}
	
}
