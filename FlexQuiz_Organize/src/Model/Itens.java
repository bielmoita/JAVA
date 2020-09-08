package Model;

import java.util.ArrayList;
import java.util.Scanner;

import Interface.Enumerando;

public class Itens implements Enumerando {
	String nomeCliente;
	int numeroVendas;
	
	String produto1 = "Batata Frita";
	String produto2 = "X-Salada";
	String produto3 = "X-Bacon";
	String produto4 = "Cachorro-Quente";
	String produto5 = "Refrigerante";
	
	//Getters and Setters
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getNumeroVendas() {
		return numeroVendas;
	}
	public void setNumeroVendas(int numeroVendas) {
		this.numeroVendas = numeroVendas;
	}
//	public String getProduto1() {
//		return produto1;
//	}
//	public void setProduto1(String produto1) {
//		this.produto1 = produto1;
//	}
//	public String getProduto2() {
//		return produto2;
//	}
//	public void setProduto2(String produto2) {
//		this.produto2 = produto2;
//	}
//	public String getProduto3() {
//		return produto3;
//	}
//	public void setProduto3(String produto3) {
//		this.produto3 = produto3;
//	}
//	public String getProduto4() {
//		return produto4;
//	}
//	public void setProduto4(String produto4) {
//		this.produto4 = produto4;
//	}
//	public String getProduto5() {
//		return produto5;
//	}
//	public void setProduto5(String produto5) {
//		this.produto5 = produto5;
//	}
	
	//Outros Métodos
	
	Scanner entrada = new Scanner(System.in);
	
	public void vender() {
		System.out.println("Qual o nome do cliente? \n");
		nomeCliente = entrada.next();
		setNomeCliente(nomeCliente);
		
		ArrayList<Double> vendasTotais = new ArrayList<>();		
		
		int opcao = 1;
		while (opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4 || opcao == 5) {
			System.out.println("Bem vindo a loja Organize!");
	        System.out.println("Digite 1 para selecionar Batata-frita - Valor: R$4,23");
	        System.out.println("Digite 2 para selecionar X-Salada - Valor: R$3,56");
	        System.out.println("Digite 3 para selecionar X-Bacon - Valor: R$4,41");
	        System.out.println("Digite 4 para selecionar Cachorro-Quente - Valor: R$8,99");
	        System.out.println("Digite 5 para selecionar Refrigerante - Valor: R$0,50");
//	        System.out.println("Digite 9 para selecionar Batata-frita - Valor: R$4,23");
	        System.out.println("Digite 0 para SAIR/Encerrar a venda.");
	        opcao = entrada.nextInt();
	        System.out.println("");
	        switch (opcao) {
			case 0: {
				
				System.out.println("Você saiu do programa.");
                System.out.println("Volte sempre.");
                break;
			}
			case 1: {
				System.out.println("A batata frita foi adicionada com exito ao cliente: "+getNomeCliente() + " No valor de: R$4,23");
				double valor = 4.23;
				vendasTotais.add(valor);
						    
			    break;
				
			}
			case 2: {
				System.out.println("O X-Salada foi adicionado com exito ao cliente: "+getNomeCliente() + " No valor de: R$3,56");
				double valor = 3.56;
				vendasTotais.add(valor);
						    
			    break;
				
			}
			case 3: {
				System.out.println("A batata frita foi adicionada com exito ao cliente: "+getNomeCliente() + " No valor de: R$4,41");
				double valor = 4.41;
				vendasTotais.add(valor);
						    
			    break;
			}
				
			case 4: {
				System.out.println("A batata frita foi adicionada com exito ao cliente: "+getNomeCliente() + " No valor de: R$8,99");
				double valor = 8.99;
				vendasTotais.add(valor);
						    
			    break;
				
			}
			case 5: {
				System.out.println("A batata frita foi adicionada com exito ao cliente: "+getNomeCliente() + " No valor de: R$0,50");
				double valor = 0.50;
				vendasTotais.add(valor);
						    
			    break;
				
			}
			default:
				System.out.println("Você digitou uma opção inválida.");
                System.out.println("");
                
			}
		}
       double somaTotal = 0.00;
		for(int i = 0; i < vendasTotais.size(); i++) {
			somaTotal += vendasTotais.get(i);
		}
		System.out.println("o Total a ser pago é de: R$" + somaTotal);
}
			
	
	
	
	

}

