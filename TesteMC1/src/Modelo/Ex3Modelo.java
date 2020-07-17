package Modelo;

import java.util.Scanner;

import Interface.Ex3Interface;

public class Ex3Modelo implements Ex3Interface {
	
	int numEleitores, numBrancos, numValidos, numNulos;
	
	double numVotos;
	
	//Getters e Setters	
	public int getNumEleitores() {
		return numEleitores;
	}

	public void setNumEleitores(int numEleitores) {
		this.numEleitores = numEleitores;
	}

	public int getNumBrancos() {
		return numBrancos;
	}

	public void setNumBrancos(int numBrancos) {
		this.numBrancos = numBrancos;
	}

	public int getNumValidos() {
		return numValidos;
	}

	public void setNumValidos(int numValidos) {
		this.numValidos = numValidos;
	}

	public int getNumNulos() {
		return numNulos;
	}

	public void setNumNulos(int numNulos) {
		this.numNulos = numNulos;
	}

	public double getNumVotos() {
		return numVotos;
	}

	public void setNumVotos(double numVotos) {
		this.numVotos = numVotos;
	}



	//OutrosMétodos
	public void calculo() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o numero de eleitores? ");
		numEleitores = entrada.nextInt();
		setNumEleitores(numEleitores);
		
		System.out.println("Qual o numero de votos em branco? ");
		numBrancos = entrada.nextInt();
		setNumBrancos(numBrancos);
		
		System.out.println("Qual o numero de votos Nulos? ");
		numNulos = entrada.nextInt();
		setNumNulos(numNulos);
		
		System.out.println("Qual o numero de votos Validos? ");
		numValidos = entrada.nextInt();
		setNumValidos(numValidos);
		
		entrada.close();
		
		numVotos = numBrancos+numNulos+numValidos;
		setNumVotos(numVotos);
		
		if (numVotos > numEleitores || numVotos < numEleitores) {
			System.out.println("Erro de calculo - O Numero de Votos tem que ser igual ao numero de Eleitores!");
			System.exit(0);			
		}
		else
			System.out.println("Porcentagem de votos brancos: "+ (numBrancos*100)/numEleitores+"%");
			System.out.println("Porcentagem de votos nulos: "+ (numNulos*100)/numEleitores+"%");
			System.out.println("Porcentagem de votos válidos: "+ (numValidos*100)/numEleitores+"%");
				
	}

}
