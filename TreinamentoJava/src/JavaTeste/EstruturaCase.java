package JavaTeste;

import java.util.Scanner;

public class EstruturaCase {
	public static void main (String args[])
	{
		Scanner	leitor = new Scanner(System.in);
		
		int dia = 0;
		System.out.println("Digite um numero para encontrar o seu dia: ");
		dia = leitor.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("DOMINGO");
			break;
			
		case 2:
			System.out.println("SEGUNDA");
			break;
		
		case 3:
			System.out.println("TERÇA");
			break;
			
		case 4:
			System.out.println("QUARTA");
			break;
			
		case 5:
			System.out.println("QUINTA");
			break;
		
		case 6:
			System.out.println("SEXTA");
			break;
		
		case 7:
			System.out.println("SABADO");
			break;
			
		default:
			System.out.println("Numero digitado Invalido");
			break;
		}
		
	}

}
