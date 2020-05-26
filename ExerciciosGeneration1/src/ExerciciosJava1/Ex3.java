package ExerciciosJava1;

import java.util.Scanner;

public class Ex3 {
	
	/*3- Faça um programa que mostre uma contagem na tela de 233 a 456, só que contando de
	  3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver. */
	
	public static void main (String args[])
	{
		//Entrada de dados
		Scanner entrada = new Scanner(System.in);
				
		//variavel de trabalho - numero, numInicial e numFinal		
		int numero, numInicial, numFinal, resultado=0;
				
		System.out.println("Entre com um numero Inicial: ");
		numInicial = entrada.nextInt();
		
		System.out.println("Entre com um numero Final: ");
		numFinal = entrada.nextInt();
		
		for (numero = numInicial; numero <=numFinal; numero++)
		{
			if(numero >= 300 && numero <= 400)
			{
				System.out.println("numero de 3 : "+numero);
				numero = numero + 2;
				
			}
			else
			{
				System.out.println("numero de 5 : "+numero);
				numero = numero + 4;
				
			}
		}
			
	}

}
