package ExerciciosJava1;

import java.util.Scanner;

public class Ex2 {
	
	/*2- Escreva um sistema estruturado que gere os n�meros de 1000 a
	1999 e escreva somente os n�meros que s�o divis�veis por 11 e cujo resto � 5. */
	
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
		
				
		
		for (numero = numInicial; numero <= numFinal; numero++)
		{
			
			if (numero%11==0 || numero%11 == 5)
			{
				
				System.out.println("numero : "+numero);
				
			}
			
						
		}			
	
		
		
	}

}
