package Model;

import java.util.ArrayList;
import java.util.Scanner;

import Interfaces.NumeroVendas;

public class Empresa implements NumeroVendas {
	String nomeVendedor;
	int numeroVendas;
	
	//Getters e Setters
	public String getNomeVendedor() {
		return nomeVendedor;
	}
	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}
	public int getNumeroVendas() {
		return numeroVendas;
	}
	public void setNumeroVendas(int numeroVendas) {
		this.numeroVendas = numeroVendas;
	}
	
	//outrosMétodos
	
	
	Scanner entrada = new Scanner(System.in);
	
	public void vender() {
		System.out.println("Qual o nome do Vendedor? \n");
		nomeVendedor = entrada.next();
		setNomeVendedor(nomeVendedor);
		
		ArrayList<Integer> vendasTotais = new ArrayList<>();
		
		
		int opcao = 1;
		while (opcao == 1 || opcao == 2) {
			System.out.println("Bem vindo a loja Kolekto!");
	        System.out.println("Digite 1 para status e quantidade de vendas.");
	        System.out.println("Digite 2 para registrar a venda");
	        System.out.println("Digite 0 para SAIR.");
	        opcao = entrada.nextInt();
	        System.out.println("");
	        switch (opcao) {
			case 0: {
				
				System.out.println("Você saiu do programa.");
                System.out.println("Volte sempre.");
                break;
			}
			case 1: {
				System.out.println("O numero de vendas do Vendedor: "+getNomeVendedor() + " é:");
				int n = vendasTotais.size();
				int i;
			    for (i=0; i<n; i++) {
			      System.out.printf("Posição %d- %s\n", i, vendasTotais.get(i));
			    }
			    
			    break;
				
			}
			case 2: {
				System.out.println("Qual venda realizada pelo vendedor "+getNomeVendedor()+" ?");
				numeroVendas = entrada.nextInt();
				setNumeroVendas(numeroVendas);
				vendasTotais.add(numeroVendas);
				
				break;
				
			}
			default:
				System.out.println("Você digitou uma opção inválida.");
                System.out.println("");
                
			}
		}
		
		
		
       
		
		if (vendasTotais.size() >=0 && vendasTotais.size() <=10)
		{
			System.out.println("Numero de vendas pequena.");
		}
		
		if(vendasTotais.size()>10 && vendasTotais.size()<=20) {
			System.out.println("Numero de vendas Média.");
		}
		
		if(vendasTotais.size()>20) {
			System.out.println("Numero de vendas Grande!");
		}
		
		
		
	}

}



//int data;
//System.out.println("Entre com a Data de venda: Apenas numero ex:15072020");
//String dataVenda[] = new String[data];

//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

//sdf.setLenient(false);


//Date date[] = new Date[data];
//entrada.nextLine();
//for (int i = 0; i < data.length(); i++) {
//    data[i] = entrada.nextLine();
//}