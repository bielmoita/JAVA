package JavaTeste;

import java.util.Scanner;

public class EntradaSaidaJava {
	public static void main (String args[])
	{
		System.out.println("Entre com a idade do seu cachorro: ");
		Scanner	in = new Scanner(System.in);
		int idadeCachorro = in.nextInt();
		idadeCachorro=idadeCachorro*7;
		
		System.out.println("Meu cachorro tem: "+idadeCachorro+" ano(s) de vida.");
	}

}
