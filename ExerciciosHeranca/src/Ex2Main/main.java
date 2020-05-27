package Ex2Main;
import java.util.Scanner;

import Ex2Model.Carro;
import Ex2Model.Motocicleta;

public class main {

	public static void main(String[] args) {
		//Variavel de trabalho
		String dados = "";
		
		//variavel de entrada de dados
		Scanner entrada = new Scanner(System.in);
		
		//Subindo as classes
		Carro carro1 = new Carro();
		Motocicleta moto1 = new Motocicleta();
		
		//inicio do programa
		System.out.println("Vamos começar pelo Seu carro: ");
		
		System.out.println("Qual o nome do Veiculo? ");
		dados = entrada.next();
		carro1.setNome(dados);
		
		System.out.println("Qual o tipo do seu carro? ");
		dados = entrada.next();
		carro1.setTipo(dados);
		
		System.out.println("Qual a cor do seu Veiculo? ");
		dados = entrada.next();
		carro1.setCor(dados);
		
		System.out.println("Qual o modelo do seu carro? ");
		dados = entrada.next();
		carro1.setModeloCarro(dados);
		
		System.out.println("Qual a marca do seu carro? ");
		dados = entrada.next();
		carro1.setMarcaCarro(dados);
		
		System.out.println("Agora sua Motocicleta: ");
		System.out.println("Qual o nome do Veiculo? ");
		dados = entrada.next();
		moto1.setNome(dados);
		
		System.out.println("Qual o tipo da sua Moto? ");
		dados = entrada.next();
		moto1.setTipo(dados);
		
		System.out.println("Qual a cor do seu Veiculo? ");
		dados = entrada.next();
		moto1.setCor(dados);
		
		System.out.println("Qual o modelo da sua moto? ");
		dados = entrada.next();
		moto1.setModeloMoto(dados);
		
		System.out.println("Qual a marca da sua moto? ");
		dados = entrada.next();
		moto1.setMarcaMoto(dados);
		
		
		
		
		entrada.close();
		
	
		//Resultados do carro
		
		System.out.println("SEU VEICULO É");
		carro1.exibeCarro();
		System.out.println();
		carro1.andar();
		carro1.frear();
		
		System.out.println("\n----------------------------------------------\n");
		
		System.out.println("SEU VEICULO É");
		moto1.exibeMoto();
		System.out.println();
		moto1.andar();
		moto1.frear();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
