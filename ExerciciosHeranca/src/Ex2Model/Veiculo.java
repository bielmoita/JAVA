package Ex2Model;

public class Veiculo {
	private String nome;
	
	private String tipo;
	
	private String cor;
	
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

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	//Metodos
	
	public void andar() {
		System.out.print("O Veiculo " + getNome()+" esta andando!");
	}
	
	public void frear() {
		System.out.print("O Veiculo " + getNome()+" parou!");
	}

}
