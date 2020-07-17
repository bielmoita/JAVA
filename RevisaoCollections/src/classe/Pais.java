package classe;

public class Pais {
	//Atributos
	private String nomePais;
	private int populacao;
	
	//método Construtor
	public Pais(String nome, int pop)
	{
		this.nomePais = nome;
		this.populacao = pop;
	}
	
	//Getters e Setters
	public String getNomePais() {
		return nomePais;
	}

	public void setNomePais(String nomePais) {
		this.nomePais = nomePais;
	}

	public int getPopulacao() {
		return populacao;
	}

	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}
	
	

}
