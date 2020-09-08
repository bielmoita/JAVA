package Main;

public class ParouImpar {

	public static void main(String[] args) {
		int Array [] =  {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	     int  par;
	     int impar;      
	     for (int i = 1; i<=Array.length; i++) { 
	        if (Par(i)) { 
	           System.out.println(i + " é Par."); 
	        } 
	        else { 
	           System.out.println(i + " é Impar."); 
	        } 
	     } 
	  } 
	   public static boolean Par(int numero) { 
	     return (numero % 2 == 0); 
	  } 

	}


