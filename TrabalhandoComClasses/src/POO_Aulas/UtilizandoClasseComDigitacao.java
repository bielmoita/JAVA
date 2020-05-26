package POO_Aulas;

import java.util.Scanner;

public class UtilizandoClasseComDigitacao {

	public static void main(String[] args) {
		String cor="";
		String marca="";
		
		//instanciando a classe Carro
		//Criar o objeto carroAluno
		Carro carroaluno = new Carro("","");
		
		//Instanciando a classe Scanner
		Scanner entrada = new Scanner(System.in);
		
		
		//Recebendo a digitação do usuario.
		System.out.print("Informe a cor: ");
		cor = entrada.nextLine();
		carroaluno.setCor(cor);
		
		System.out.print("Informe a marca: ");
		marca = entrada.nextLine();
		carroaluno.setMarca(marca);
		
		//Mostrando os resultados
		carroaluno.mostraMarcaCor();
		
		
		

	}

}
