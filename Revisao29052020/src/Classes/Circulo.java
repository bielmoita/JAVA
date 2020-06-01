package Classes;

import Interfaces.FormaGeometrica;

public class Circulo implements FormaGeometrica {
	//Atributos
	private double raio;
	
	//Constante PI
	//private static final double PI=3.14;
	

	//Getters e Setters
	public double getRaio() {
		return raio;
	}

	

	@Override
	public double area() {
		//pi x r² --
		return (Math.PI * Math.pow(getRaio(), 2));
		
	}

	@Override
	public double comprimento() {
		//2*Pi * raio
		return (2*Math.PI * getRaio());
	}

	@Override
	public void imprime() {
		System.out.println();
		System.out.println("Area do circulo: "+area());
		System.out.println("Comprimento do circulo: "+comprimento());
		
	}



	@Override
	public void setLado(double lado) {
		// Método não é utilizado nessa classe
		//Não faço nada mas tenho que deixa-lo aqui
		
	}



	@Override
	public void setRaio(double raio) {
		this.raio = raio;
		
	}
	
	//Outros métodos
	
	

}
