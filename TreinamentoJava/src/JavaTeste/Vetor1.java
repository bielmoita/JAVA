package JavaTeste;

import java.util.Scanner;

public class Vetor1 {
	public static void main (String args[])
	{
		Scanner entrada = new Scanner(System.in);
		
		int[] arrayUm = {12, 3, 5, 68, 9, 6, 73, 44, 456, 65, 321} ;
		int[] arrayDois = {43, 42, 4, 8, 55, 21, 2, 45} ;
		
		float[] nota = new float[5];
		
		//tamanho do array
		if (arrayDois.length > 8)
		{
			System.out.println("Tamanho do ArrayDois - Maior que 8!");
		}
		else
		{
			System.out.println("Tamanho do ArrayDois - Menor que 8!");
		}
	
		System.out.println("\nTamanho do ArrayUm = "+arrayUm.length);
		
		//utilização do for-each
		String[] cars = {"Volvo","","Ford","Mazda"};
		
		for (String i : cars) 
		{
			System.out.println(i);
		}
		
		//populando um Array
		for (int i=0; i<5; i++)
		{
			System.out.println("Entre com uma nota: ");
			nota[i]=entrada.nextFloat();
		}
		//Apresentando um Array
		for (int i=0; i<5; i++)
		{
			System.out.println("Nota "+(i+1)+" = "+nota[i]);
		}
	}

}
