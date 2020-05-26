package ExerciciosJava1;

import java.util.Scanner;

public class Ex10 {
	/*
	 * 10- Escreve um sistema que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma
	posição das matrizes N1 e N2;
	b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de
	mesma posição das matrizes N1 e N2.
	 */
	
	public static void main (String args[])
	{
		int[][] matriz1 = new int[4][6];
		int[][] matriz2 = new int[4][6];
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Matriz M[4][6]\n");
		
		for (int linha=0; linha < 4; linha++)
		{
			for (int coluna=0; coluna < 6; coluna++)
			{
				System.out.printf("Insira o elemento M[%d][%d]: ",linha+1,coluna+1);
				matriz1[linha][coluna] = entrada.nextInt();
			}
		}
		
		//Matriz 2
		System.out.printf("Agora a Matriz 2");
		for (int linha=0; linha < 4; linha++)
		{
			for (int coluna=0; coluna < 6; coluna++)
			{
				System.out.printf("Insira o elemento M[%d][%d]: ",linha+1,coluna+1);
				matriz2[linha][coluna] = entrada.nextInt();
			}
		}
		
		
		
		
		//Trazer o resultado da opção A
		System.out.println("\nA Matriz ficou A: \n");
		for (int linha=0; linha<4; linha++)
		{
			for (int coluna = 0; coluna<6; coluna++)
			{
				System.out.printf("\t %d \t", matriz1[linha][coluna]+matriz2[linha][coluna]);
				
			}
			System.out.println();
		}
		
		//Trazer o resultado da opção B
				System.out.println("\nA Matriz ficou B: \n");
				for (int linha=0; linha<4; linha++)
				{
					for (int coluna = 0; coluna<6; coluna++)
					{
						System.out.printf("\t %d \t", matriz1[linha][coluna]-matriz2[linha][coluna]);
						
					}
					System.out.println();
				}
		
		
		
	}

}
