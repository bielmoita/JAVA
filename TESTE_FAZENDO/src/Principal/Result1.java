package Principal;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Result1 {
	
	//
	/*
	 * Enunciado
	 * 
	 *
	 */
	public static void main (String [] args){
        String coins;
        Scanner stdin = new Scanner(System.in);
        coins = stdin.next();
        stdin.close();
        System.out.println(fewestCoins(coins));


    }

   public static int fewestCoins(String coins) {
   List<Integer> bolsaMoedas = new ArrayList<>();
   char[] caractere = coins.toCharArray();
   int tamanho = getTamanho(coins);
   for (int j=0; j <= caractere.length - tamanho; j++){
       for(int i=0; i<caractere.length; i++){
           if(j+i+tamanho <= caractere.length){
               String auxiliar = coins.substring(j,j+i+tamanho);
               if(getTamanho(auxiliar) == tamanho){
                   bolsaMoedas.add(auxiliar.length());
               }

           }

       }

   }
   return Collections.min(bolsaMoedas);

   }

   public static int getTamanho(String coins) {
       char[] caracter = coins.toCharArray();
       Set<Character> setarCaracter = new HashSet<>();

       for (Character a : caracter){
           setarCaracter.add(a);
       }
       return setarCaracter.size();
   }

}
