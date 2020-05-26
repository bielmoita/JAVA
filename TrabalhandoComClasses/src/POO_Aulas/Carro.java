package POO_Aulas;

public class Carro {
	//Atributos
	//Lembrar encapsulamento
	private String cor;
	private String marca;
	//fim dos atributos
	
	//Método construtor - Tem sempre o mesmo nome da classe
	public Carro(String cor, String marca)
	{
		this.cor = cor;
		this.marca = marca;
	}
	//fim do método construtor - Sempre sera executado no momento que eu instanciar a classe
	
	//Getters e Setters
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	//fim dos getters e setters
	
	//outros métodos da classe Carro
	public void mostraMarca()
	{
		System.out.println("A marca do carro é: "+getMarca());
	}
	
	public void mostraMarcaCor()
	{
		System.out.println("Meu carro é: "+
				getCor()+" e a marca do carro é: "+getMarca());
	}
	
}
