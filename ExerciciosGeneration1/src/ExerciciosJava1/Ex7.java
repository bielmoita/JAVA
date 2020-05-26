package ExerciciosJava1;

import java.util.Scanner;

public class Ex7 {
	/*
	 * 7- Escrever um sistema que lê um valor N inteiro e positivo e que calcula e
	escreve o valor de E. E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + 1 / N!
	 */
	public static void main (String args[])
	{
		//Entrada de dados
		Scanner entrada = new Scanner(System.in);
		int num;
		
		
		System.out.println("Entre com um numero para fatorar: ");
		num = entrada.nextInt();
		
		int fat=num;
		
		if(num == 0 || num ==1)
		{
			System.out.println("O Numero não pode ser zero ou 1");
		}
		
		else if (num >= 2)
		{
			while (num>1)
			{
				fat = fat*(num-1);
				num--;
			}
			System.out.println("o fatorial buscado é: "+fat);
		}
		
		
		
		
	}

}
