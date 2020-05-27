package Ex3Model;

public class Veiculo {
	
	private String nome;
	private String tipo;
	int velocidade;
	
	
	//GETTERS e SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	//Metodos
	public void acelerar() {
		int aumentarV = 20;
		System.out.println("O "+getNome()+" que � um(a) "+getTipo());
		System.out.println("A velocidade do veiculo �: "+getVelocidade());
		
		System.out.println("Em acelera��o se soma mais 20Km/h a velocidade do veiculo");
		System.out.println("A velocidade do veiculo ap�s a acelera��o �: "+(getVelocidade()+aumentarV)+" KM/h \n");
		this.setVelocidade(aumentarV+getVelocidade());
		
	}
	
	public void frear() {
		int aumentarV = velocidade-20;
		System.out.println("O "+getNome()+" que � um(a) "+getTipo());
		System.out.println("A velocidade do veiculo �: "+getVelocidade());
		
		System.out.println("Em desacelera��o se subtrai mais 20Km/h a velocidade do veiculo");
		System.out.println("A velocidade do veiculo ap�s a desacelera��o �: "+(getVelocidade()-aumentarV)+ " KM/h \n");
		this.setVelocidade(aumentarV-getVelocidade());
		
	}
	
	

}
