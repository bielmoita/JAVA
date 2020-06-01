package Principal;

import java.util.Scanner;
import Classes.*;
import Interfaces.*;

public class Principal {

	public static void main(String[] args) {
		
		double lado, raio;
		
		//instanciando a classe Scanner
		Scanner in = new Scanner(System.in);
		
		System.out.print("Informe o comprimento do lado do Quadrado: ");
		lado = in.nextDouble();
		
		System.out.print("informe o raio do Circulo: ");
		raio = in.nextDouble();
		
		in.close();
		
		//Movimentar as variaveis raio e lado para as Classes.
		FormaGeometrica quadrado = new Quadrado();
		FormaGeometrica circulo = new Circulo();
		
		quadrado.setLado(lado);
		circulo.setRaio(raio);
		
		quadrado.imprime();
		System.out.println("-------------------------------------");
		circulo.imprime();
		

	}

}
