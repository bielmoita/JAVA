package ExerciciosJava1;

import java.util.Scanner;

public class Ex1 {
	
	//Exercicio proposto
	//1- Desenvolver um sistema que efetue a soma de todos os números ímpares
	//que são múltiplos de três e que se encontram no conjunto dos números de 1 até 500
	
	public static void main (String args[])
	{
		//Setar um numero inicial.
		Scanner nInicial = new Scanner(System.in);
		
		//Setar um numero final.
		Scanner nFinal = new Scanner(System.in);
		
		//variavel de trabalho - numero, numinicial e numFinal		
		int numero, numInicial, numFinal, resultado=0;
		
		System.out.println("Entre com um numero Inicial: \n");
		numInicial = nInicial.nextInt();
		
		System.out.println("Entre com um numero Final: \n");
		numFinal = nFinal.nextInt();
		
		
		for (numero = numInicial; numero <= numFinal; numero++)
		{
			
			if (numero%3==0 && numero%2 != 0)
			{
				
				System.out.println("numero : "+numero);
				resultado = resultado + numero;
			}
			
						
		}			
	
		System.out.println("A soma de todos os numeros impares multiplos de tres no perido escolhido é: "+resultado);
		
	}

}
