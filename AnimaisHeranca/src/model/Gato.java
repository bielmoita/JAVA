package model;

public class Gato extends Mamifero {
	
	private boolean bigode;
	
	//GETTERS e SETTERS

	public boolean isBigode() {
		return bigode;
	}

	public void setBigode(boolean bigode) {
		this.bigode = bigode;
	}
	
	//M�todos
	
	public void miar() {
		System.out.println("O Gato "+getNome()+ " esta miando!");
	}
	
	

}
