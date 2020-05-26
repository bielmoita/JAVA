package JavaTeste;

import java.util.Scanner;

public class ExemploFor {
	public static void main (String args[])
	{
		Scanner leitor = new Scanner(System.in);
		int i,somapar=0,somaimpar=0, valor;
		
		System.out.println("Entre com um valor:  ");
		valor = leitor.nextInt();
		
		for(i=0; i<=valor; i++)
		{
			if (i%2==0)
				somapar=somapar+i;
			else
				somaimpar=somaimpar+i;
		}
		
		System.out.println("Soma de pares: "+somapar);
		System.out.println("Soma de Impares: "+somaimpar);
		
		
	}

}
