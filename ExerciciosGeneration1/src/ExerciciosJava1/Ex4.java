package ExerciciosJava1;

import java.util.Scanner;

public class Ex4 {
	/*
	4- Ler o nome de um aluno e as suas duas notas A e B, e após calcular a média
	ponderada entre estas notas (A tem peso 1 e B tem peso 2). Verifique se a
	nota digitada é valida, caso seja inválida, repita a leitura. Repetir este
	procedimento para uma turma composta por cinco alunos, usando o comando
	While .
	Exemplo de tela de saída: Entre com o
	nome do aluno: Fulano da Silva Entre com
	o grau A: 5.0 Entre com o grau B: 6.0 O
	aluno Fulano da Silva tem uma media: 5.66
	Entre com o nome do aluno: Ciclano da
	Silva Entre com o grau A: 12.5 Nota
	invalida! Entre com o grau A: 2.5 ...
	*/
	
	public static void main (String args[])
	{
		//Entrada de dados
		Scanner entrada = new Scanner(System.in);
						
		//variavel de trabalho - numero, numInicial e numFinal
		String nome;
		int numero=0, pesoA=1, pesoB=2; 
		double notaA, notaB, ntA=0, ntB=0;
		
		System.out.println("Entre com o nome do aluno: ");
		nome = entrada.nextLine();
		
		System.out.println("Entre com a Nota A: ");
		notaA = entrada.nextInt();
		
		while (numero >= 0)
		{
			
			if(notaA <=0 && notaA>=10)
			{
				System.out.println("Nota Incorreta, insira a nota certa");
				numero++;	
			}	
			else
			{				
				ntA= notaA;
			}
			numero++;
			
		}
		
		System.out.println("Entre com a Nota B: ");
		notaB = entrada.nextInt();
		
		while (numero >= 0)
		{
			
			
			if(notaB <=0 && notaB>=10)
			{
				System.out.println("Nota Incorreta, insira a nota certa");
				numero++;				
			}
			else
			{
				ntB= notaB;
				
			}
			numero++;
		}
		
		double mediaP;
		mediaP = ((1*ntA) + (2*ntB)) / 3;
		
		System.out.println("A média ponderada das notas do "+nome+" é: "+mediaP);
			
		
		
		
		
	}
}
