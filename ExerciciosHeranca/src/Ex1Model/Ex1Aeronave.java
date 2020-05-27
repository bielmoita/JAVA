package Ex1Model;

public class Ex1Aeronave {
	
	private String nome;
	private String modelo;
	private boolean asa;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean isAsa() {
		return asa;
	}
	public void setAsa(boolean asa) {
		this.asa = asa;
	}
	
	
	//Metodos
	public void voar() {
		System.out.print("O Aviao "+getNome()+" de modelo "+getModelo()+" Que tem asa "+isAsa()+" Esta voando!");
	}
	

}
