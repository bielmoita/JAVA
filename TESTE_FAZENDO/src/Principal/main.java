package Principal;

public class main {

	public static void main(String[] args) {
		
		X y = new Y(80, 24);
		X w = new W(y);
		X v = new V(w);
		X z = new Z(v);
		z.draw();
		
		

	}
	
	public abstract class S implements X {
		X componente;
		public void draw() {
		componente.draw();
		}
	
	
}


