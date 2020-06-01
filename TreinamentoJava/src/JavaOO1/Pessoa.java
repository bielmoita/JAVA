package JavaOO1;

public abstract class Pessoa {
	protected String xNome;
	
	
	protected Pessoa() {
		xNome = "Sem nome";
	}
	protected Pessoa(String nome) {
		xNome = nome;
	}
	
	public String getNome() {
		return xNome;
	}
	

}

class Fisica extends Pessoa {
	private String xCPF;
	public Fisica() {
		super();
	}
	public Fisica(String nome) {
		super(nome);
	}
	public String getCPF() {
		return xCPF;
	}
}

class Juridica extends Pessoa {
	private String xCNPJ;
	public Juridica() {
		super();
	}
	public Juridica(String nome) {
		super(nome);
	}
	public String getCNPJ() {
		return xCNPJ;
	}
	public String getNome() {
		return super.getNome();
	}
}
