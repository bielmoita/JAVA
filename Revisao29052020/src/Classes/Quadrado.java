package Classes;

import Interfaces.FormaGeometrica;

public class Quadrado implements FormaGeometrica {
	//atributos
	private double lado;
	
	//Getters e Setters

	public double getLado() {
		return lado;
	}

	

	@Override  //Anotações - métodfo da interface que precisa ser implementado
	public double area() {
		return (Math.pow(getLado(), 2));
	}

	@Override
	public double comprimento() {
		
		return (getLado() * 4);
	}

	@Override
	public void imprime() {
		System.out.println();
		System.out.println("A area do quadro é: "+area());
		System.out.println("Comprimento do Quadrado: "+comprimento());
		
	}



	@Override
	public void setLado(double lado) {
		this.lado = lado;
		
	}



	@Override
	public void setRaio(double raio) {
		// Método não é utilizado nessa classe
		//Não faço nada mas tenho que deixa-lo aqui
		
	}
	
	
	
	
	//outros métodos
	
	

}
