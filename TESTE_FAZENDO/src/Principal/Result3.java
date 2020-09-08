package Principal;

import java.util.HashSet;
import java.util.Set;

public class Result3 {

	public static void main (String [] args){
        String testando = "aabaa";
        System.out.println(palindromos(testando));
    }

   public static int countPalindromes(String s) {
   int palindromos = 0;
   for (int i=0; i<s.length(); i++){
       for(int j = i+1, k=i; k>0 && j < s.length(); j++){
           if(s.charAt(k) == s.charAt(j))
           palindromos++;
           k-=1;
           if(s.charAt(k) == s.charAt(j))
           palindromos++;
       }
   }
   return palindromos;

   }
   static int palindromo(String s)
   {
       Set<String> palindromos = new HashSet<String>();
       Set<String> rejeitarPalindromos = new HashSet<String>();
       String atual = null;

       for (int i=0;i<s.length();i++){
           for (int j=i+1; j<=s.length(); j++){
               atual=s.substring(i,j);
               if(!palindromos.contains(atual) && !rejeitarPalindromos.contains(atual)){
                   if(!simPalindromo(atual)){
                       rejeitarPalindromos.add(atual);
                   }
                   else{
                       palindromos.add(atual);
                   }
               }
           }
       }
       return palindromos.size();
   }

   static boolean simPalindromo(String s){
       int sTamanho = s.length();
       if(s!=null){
           for(int i=0; i<sTamanho/2; i++){
               if(s.charAt(i) != s.charAt(sTamanho-i-1))
               return false;
           }
       }
       return true;
   }

   static int palindromos(final String inputar){
       final Set<String> palindromosSet = new HashSet<String>();
       for (int i=0; i<inputar.length(); i++){
           expandirPalindromo(palindromosSet, inputar, i, i+1);
           expandirPalindromo(palindromosSet, inputar, i, i);
       }
       return palindromosSet.size();
   }

   static void expandirPalindromo(final Set<String> resultado, final String inputar, int i, int j){
       while(i >= 0 && j < inputar.length() && inputar.charAt(i) == inputar.charAt(j)){
           resultado.add(inputar.substring(i,j+1));
           i--;
           j++;
       }
   }

}
