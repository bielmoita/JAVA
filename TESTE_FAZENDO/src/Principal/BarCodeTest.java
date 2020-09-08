package Principal;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class BarCodeTest {

	public static void main(String[] args) {
		System.out.println(calculaLinha("39993000000000014993739040736027668911000002"));

	}
	
public static String calculaLinha(String barraDigitada) {
		
		String linha = barraDigitada.replaceAll("[^0-9]", "");
		
		if (linha.length() != 44) {
			return null;
		}
		
		String campo1 = linha.substring(0,4)+linha.substring(19,20)+'.'+linha.substring(20,24);
	    String campo2 = linha.substring(24,29)+'.'+linha.substring(29,34);
	    String campo3 = linha.substring(34,39)+'.'+linha.substring(39,44);
	    String campo4 = linha.substring(4,5); // Digito verificador
	    String campo5 = linha.substring(5,19); // Vencimento + Valor
	    
	    if ( modulo11Banco( linha.substring(0,4)+linha.substring(5,44) ) != Integer.valueOf(campo4) ) {
	    	return null;
	    }
	    String linhaDigitavel;
	    
	    linhaDigitavel = campo1 + modulo10(campo1)
	    +' '
	    +campo2 + modulo10(campo2)
        +' '
        +campo3 + modulo10(campo3)
        +' '
        +campo4
        +' '
        +campo5;
	    
	    
	    return linhaDigitavel
        +'\n'
        +"Vencimento em: "+campo5.substring(6,7)+'/'+campo5.substring(4,5)+'/'+campo5.substring(0,4)
        +'\n'
        +"Valor a ser pago: R$"+campo5.substring(8,12)+","+campo5.substring(12,14);
	    //TESTE: 39993.73909 40736.027661 89110.000026 3 20200808001499
	    //Teste2: 
        
        
	}
	//public static Date expiraEm(String barraDigitada) {
		//Date expiraEm = null;

		//if (calculaLinha(barraDigitada) = true) {
			//final int daysToExpire = Integer.parseInt(calculaLinha(barraDigitada).substring(5, 9));
			//final Calendar calendar = new GregorianCalendar(1997, Calendar.OCTOBER, 7);
			//calendar.add(Calendar.DAY_OF_YEAR, daysToExpire);
			//expiraEm = calendar.getTime();
		//}

		//return expiraEm;
	//}




	public static int modulo10(String numero) {
			numero = numero.replaceAll("[^0-9]","");
			int soma  = 0;
			int peso  = 2;
			int contador = numero.length()-1;
			while (contador >= 0) {
				int multiplicacao = Integer.valueOf( numero.substring(contador,contador+1) ) * peso;
				if (multiplicacao >= 10) {multiplicacao = 1 + (multiplicacao-10);}
				soma = soma + multiplicacao;
				if (peso == 2) {
					peso = 1;
				} else {
					peso = 2;
				}
				contador = contador - 1;
			}
			int digito = 10 - (soma % 10);
			if (digito == 10) digito = 0;

			return digito;
	}

	public static int modulo11Banco(String numero) {
		numero = numero.replaceAll("[^0-9]","");

		int soma  = 0;
		int peso  = 2;
		int base  = 9;
		int contador = numero.length() - 1;
		for (int i=contador; i >= 0; i--) {
			soma = soma + ( Integer.valueOf(numero.substring(i,i+1)) * peso);
			if (peso < base) {
				peso++;
			} else {
				peso = 2;
			}
		}
		int digito = 11 - (soma % 11);
		if (digito >  9) digito = 0;
		/* Utilizar o dígito 1(um) sempre que o resultado do cálculo padrão for igual a 0(zero), 1(um) ou 10(dez). */
		if (digito == 0) digito = 1;
		return digito;
		
	}

}
