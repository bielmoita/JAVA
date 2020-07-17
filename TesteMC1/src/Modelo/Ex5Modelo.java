package Modelo;

import java.util.Scanner;

import Interface.Ex5Interface;

public class Ex5Modelo implements Ex5Interface {
	double temperaturaF, temperaturaC;
	
	//Getters e setters
	public double getTemperaturaF() {
		return temperaturaF;
	}

	public void setTemperaturaF(double temperaturaF) {
		this.temperaturaF = temperaturaF;
	}

	public double getTemperaturaC() {
		return temperaturaC;
	}

	public void setTemperaturaC(double temperaturaC) {
		this.temperaturaC = temperaturaC;
	}



	//OutrosMétodos
	public void conversao() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual a temperatura em Fahrenheit ? ");
		temperaturaF = entrada.nextDouble();
		setTemperaturaF(temperaturaF);
		
		entrada.close();
		
		temperaturaC = (temperaturaF-32)*5/9;
		setTemperaturaC(temperaturaC);
		
		System.out.println("A temperatura informada em Fahrenheit foi de: "+getTemperaturaF()+"ºF");
		System.out.println("A temperatura em Celsius é de: "+getTemperaturaC()+"ºC");
		
		
	}

	

}
