package Model;

import java.util.Scanner;

import Interface.EnqueteInterface;

public class EnqueteModel implements EnqueteInterface {
	
	int numVotantes, numWindowsServer, numUnix, numLinux, numNetware, numMacOS, numOutro;
	
	double numVotos;
	
	//Getters and Setters
	
	public int getNumVotantes() {
		return numVotantes;
	}
	public void setNumVotantes(int numVotantes) {
		this.numVotantes = numVotantes;
	}
	
	public int getNumWindowsServer() {
		return numWindowsServer;
	}

	public void setNumWindowsServer(int numWindowsServer) {
		this.numWindowsServer = numWindowsServer;
	}

	public int getNumUnix() {
		return numUnix;
	}

	public void setNumUnix(int numUnix) {
		this.numUnix = numUnix;
	}

	public int getNumLinux() {
		return numLinux;
	}

	public void setNumLinux(int numLinux) {
		this.numLinux = numLinux;
	}

	public int getNumNetware() {
		return numNetware;
	}

	public void setNumNetware(int numNetware) {
		this.numNetware = numNetware;
	}

	public int getNumMacOS() {
		return numMacOS;
	}

	public void setNumMacOS(int numMacOS) {
		this.numMacOS = numMacOS;
	}

	public int getNumOutro() {
		return numOutro;
	}

	public void setNumOutro(int numOutro) {
		this.numOutro = numOutro;
	}

	public double getNumVotos() {
		return numVotos;
	}

	public void setNumVotos(double numVotos) {
		this.numVotos = numVotos;
	}
	
	//Outros métodos
	public void calculo() {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o numero de Votantes? ");
		numVotantes = entrada.nextInt();
		setNumVotantes(numVotantes);
		
		System.out.println("Qual o numero de votos em Windows Server? ");
		numWindowsServer = entrada.nextInt();
		setNumWindowsServer(numWindowsServer);
		
		System.out.println("Qual o numero de votos Unix? ");
		numUnix = entrada.nextInt();
		setNumUnix(numUnix);
		
		System.out.println("Qual o numero de votos Linux? ");
		numLinux = entrada.nextInt();
		setNumLinux(numLinux);
		
		System.out.println("Qual o numero de votos Netware? ");
		numNetware = entrada.nextInt();
		setNumNetware(numNetware);
		
		System.out.println("Qual o numero de votos MacOS? ");
		numMacOS = entrada.nextInt();
		setNumMacOS(numMacOS);
		
		System.out.println("Qual o numero de votos Outro? ");
		numOutro = entrada.nextInt();
		setNumOutro(numOutro);
		
		
		entrada.close();
		
		numVotos = numWindowsServer + numUnix+ numLinux+ numNetware+ numMacOS+ numOutro;
		setNumVotos(numVotos);
		
		if (numVotos > numVotantes || numVotos < numVotantes) {
			System.out.println("Erro de calculo - O Numero de Votos tem que ser igual ao numero de Votantes!");
			System.exit(0);			
		}
		else
			System.out.println("Porcentagem de votos Windows Server: "+ (numWindowsServer*100)/numVotantes+"%");
			System.out.println("Porcentagem de votos Unix: "+ (numUnix*100)/numVotantes+"%");
			System.out.println("Porcentagem de votos Linux: "+ (numLinux*100)/numVotantes+"%");
			System.out.println("Porcentagem de votos Netware: "+ (numNetware*100)/numVotantes+"%");
			System.out.println("Porcentagem de votos MacOS: "+ (numMacOS*100)/numVotantes+"%");
			System.out.println("Porcentagem de votos Outros: "+ (numOutro*100)/numVotantes+"%");
			
	}
	

}
