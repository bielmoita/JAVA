package ExerciciosJava1;

import java.util.Scanner;

public class Ex11 {
	/*
	 * 11- Escrever um sistema que lê uma matriz M(5,5) e cria 2 vetores SL(5) e SC(5)
	que contenham, respectivamente, as somas das linhas e das colunas de M.
	Escrever a matriz e os vetores criados.
	 */
	public static void main (String args[])
	{
		int[][] matriz = new int[5][5];
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Matriz M[5][5]\n");
		
		for (int linha=0; linha < 5; linha++)
		{
			for (int coluna=0; coluna < 5; coluna++)
			{
				System.out.printf("Insira o elemento M[%d][%d]: ",linha+1,coluna+1);
				matriz[linha][coluna] = entrada.nextInt();
			}
		}
		
		//Trazer o resultado  da linha com Coluna
		System.out.println("\nA Matriz ficou: \n");
		for (int linha=0; linha<5; linha++)
		{
			for (int coluna = 0; coluna<5; coluna++)
			{
				System.out.printf("\t %d \t", matriz[linha+coluna][coluna+linha]);
				
			}
			System.out.println();
		}
		
	}

}
	
