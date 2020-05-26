package JavaTeste;

import java.util.Scanner;

public class Controle2 {
	public static void main (String args[]) 
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Sexo: ");
		char sexo = entrada.next().charAt(0);
		
		System.out.println("Peso: ");
		double peso = entrada.nextDouble();
		
		System.out.println("Altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / (altura * altura);
		
		if (sexo == 'F' && imc < 19.1)
		{
			System.out.println("Abaixo do peso. ");
		}
		else if (sexo == 'F' && imc <= 25.8)
		{
			System.out.println("Peso ideal.");
		}
		else if (sexo == 'F' && imc <= 27.3)
		{
			System.out.println("Um pouco acima do peso.");
		}
		else if (sexo == 'F' && imc <= 32.3)
		{
			System.out.println("Acima do peso ideal");
		}
		else if (sexo == 'F')
		{
			System.out.println("Obesidade");
		}
		else if (sexo == 'M' && imc < 20.7)
		{
			System.out.println("Abaixo do peso. ");
		}
		else if (sexo == 'M' && imc <= 26.4)
		{
			System.out.println("Peso ideal.");
		}
		else if (sexo == 'M' && imc <= 27.8)
		{
			System.out.println("Um pouco acima do peso.");
		}
		else if (sexo == 'M' && imc <= 31.1)
		{
			System.out.println("Acima do peso ideal");
		}
		else if (sexo == 'M')
		{
			System.out.println("Obesidade");
		}
		
		
	}

}
