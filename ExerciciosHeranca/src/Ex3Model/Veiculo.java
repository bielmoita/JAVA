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
		System.out.println("O "+getNome()+" que é um(a) "+getTipo());
		System.out.println("A velocidade do veiculo é: "+getVelocidade());
		
		System.out.println("Em aceleração se soma mais 20Km/h a velocidade do veiculo");
		System.out.println("A velocidade do veiculo após a aceleração é: "+(getVelocidade()+aumentarV)+" KM/h \n");
		this.setVelocidade(aumentarV+getVelocidade());
		
	}
	
	public void frear() {
		int aumentarV = velocidade-20;
		System.out.println("O "+getNome()+" que é um(a) "+getTipo());
		System.out.println("A velocidade do veiculo é: "+getVelocidade());
		
		System.out.println("Em desaceleração se subtrai mais 20Km/h a velocidade do veiculo");
		System.out.println("A velocidade do veiculo após a desaceleração é: "+(getVelocidade()-aumentarV)+ " KM/h \n");
		this.setVelocidade(aumentarV-getVelocidade());
		
	}
	
	

}
