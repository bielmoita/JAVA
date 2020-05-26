package JavaTeste;

import java.util.Scanner;

public class ExemploDoWhile {
	public static void main (String args[])
	{
		//Looping do-while II
		Scanner in = new Scanner(System.in);
		int x = 0; //Onde armazenaremos a operação desejada.
		double num1, num2, resultado = 0;
		
		do {
			
			System.out.println(" 1) somar ");
			System.out.println(" 2) subtrair ");
			System.out.println(" 3) multiplicar ");
			System.out.println(" 4) dividir ");
			System.out.println(" 0) sair ");
			
			System.out.println("Digite o código da operação desejada: ");
			x = in.nextInt();
			
			if ( x != 0 )
			{
				System.out.println("Digite o primeiro numero: ");
				num1 = in.nextDouble();
				
				System.out.println("Digite o segundo numero: ");
				num2 = in.nextDouble();
				
				if (x == 1)
				{
					resultado = num1 + num2;
				}
				else
				{
					if(x == 2)
					{
						resultado = num1 - num2;
					}
					else
					{
						if (x == 3)
						{
							resultado = num1 * num2;
						}
						else
						{
							if (x == 4) 
							{
								resultado = num1 / num2;
							}
						}
					}
					
			}	
				System.out.println();
				System.out.println("O resultado é: " + resultado);
				System.out.println();
				
			}
			else
			{
				resultado = 0;
			}
			
			
		}
		while (x != 0);
	}
	

}
