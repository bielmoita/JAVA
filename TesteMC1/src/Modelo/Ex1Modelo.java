package Modelo;

import Interface.Ex1Interface;

public class Ex1Modelo implements Ex1Interface {
	int a, b, c;
	String nome;
	
	//Getters e Setters
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//OutrosMétodos
	public void executarEx1() {
		a=10;
		b=20;
		System.out.println("O Valor de A é: "+a);
		System.out.println("O Valor de B é: "+b);
		
		c=a;
		a=b;
		b=c;
		System.out.println("O Valor de A é: "+a);
		System.out.println("O Valor de B é: "+b);
	}
	@Override
	public String nome() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
