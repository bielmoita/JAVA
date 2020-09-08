package Principal;

import java.util.Arrays;

public class Result2 {

	public static int ERRO = -1000000000;

    public static int longestVowelSubsequence(String s, char[] caractere) {
    
    if(s.length() == 0 || caractere.length == 0){
        return 0;
    }

    if (s.length() < caractere.length){
        return ERRO;
    }

    if(s.length() == caractere.length){
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i) != caractere[i]){
                return ERRO;
            }
        }
        return s.length();

    }
    if (s.charAt(0) < caractere[0]){
        return longestVowelSubsequence(s.substring(1), caractere);
    }
    else if(s.charAt(0) == caractere[0]){
        return Math.max(
            Math.max((1+longestVowelSubsequence(s.substring(1), Arrays.copyOfRange(caractere, 1, caractere.length) ) ), 
            (1+longestVowelSubsequence(s.substring(1), caractere) ) ),
            (longestVowelSubsequence(s.substring(1),caractere )) );
    }
    else{
        return longestVowelSubsequence(s.substring(1), caractere);
    }
    }

    public static void main (String [] args){
        char[] vogais = {'a','e','i','o','u'};

        String teste1 = "aeio";
        String teste2 = "aaeeieou";
        String teste3 = "aeiaaioooaauuaeiu";

        System.out.println(longestVowelSubsequence(teste1, vogais));
        System.out.println(longestVowelSubsequence(teste2, vogais));
        System.out.println(longestVowelSubsequence(teste3, vogais));

    }

}
