package Principal;

public class Cougar extends Feline {

	public Cougar() { 
		System.out.print("cougar "); 
		} 
		void go() { 
		type = "c "; System.out.print(this.type + super.type); 
		} 
		public static void main(String[] args) { 
		new Cougar().go(); 
		} 

}
