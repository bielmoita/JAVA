package JavaOO;

public abstract class Telefone {
	
	private String tipo;
	//M�todo abstrato para uso em polimorfismo
	abstract public void disca(String numero);
	//M�todo abstrato para uso em Polimorfismo.
	abstract public void toca(int numToques);
	
	public Telefone(String tipo)
	{ //Construtor
		this.tipo = tipo;
	}
	

}
