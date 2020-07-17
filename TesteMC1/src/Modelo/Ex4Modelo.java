package Modelo;

import java.util.Scanner;

import Interface.Ex4Interface;

public class Ex4Modelo implements Ex4Interface {
	public String nomeFuncionario;
	public double reajuste, salarioAtual, salarioReajuste;
	
	//Getters e Setters
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public double getReajuste() {
		return reajuste;
	}
	public void setReajuste(double reajuste) {
		this.reajuste = reajuste;
	}
	public double getSalarioAtual() {
		return salarioAtual;
	}
	public void setSalarioAtual(double salarioAtual) {
		this.salarioAtual = salarioAtual;
	}
	public double getSalarioReajuste() {
		return salarioReajuste;
	}
	public void setSalarioReajuste(double salarioReajuste) {
		this.salarioReajuste = salarioReajuste;
	}
	
	
	
	
	//OutrosMétodos
	public void reajuste() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o nome do Funcionario? \n");
		nomeFuncionario = entrada.next();
		setNomeFuncionario(nomeFuncionario);
		
		System.out.println("Qual o Salario do funcionario "+getNomeFuncionario()+" ?");
		salarioAtual = entrada.nextDouble();
		setSalarioAtual(salarioAtual);
		
		System.out.println("Qual a porcentagem de reajuste do salario informado? -- \nEscreva apenas o numero");
		reajuste = entrada.nextDouble();
		setReajuste(reajuste);
		
		entrada.close();
		
		System.out.println("O Salário do funcionario "+getNomeFuncionario()+" era de: R$"+getSalarioAtual());
		System.out.println("O reajuste informado foi de: "+getReajuste()+"%");
		
		salarioReajuste = (salarioAtual*reajuste)/100;
		System.out.println("O ajuste no salario foi de: R$"+salarioReajuste);
		setSalarioReajuste(salarioReajuste);
		
		salarioAtual = salarioAtual+salarioReajuste;
		System.out.println("O Salario atual passa a ser: R$"+salarioAtual);
		
		
	}
	
	

}
