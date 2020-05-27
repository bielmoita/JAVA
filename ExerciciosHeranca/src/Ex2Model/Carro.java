package Ex2Model;

public class Carro extends Veiculo {
	private String modeloCarro;
	private String marcaCarro;
	
	
	public String getModeloCarro() {
		return modeloCarro;
	}
	public void setModeloCarro(String modeloCarro) {
		this.modeloCarro = modeloCarro;
	}
	public String getMarcaCarro() {
		return marcaCarro;
	}
	public void setMarcaCarro(String marcaCarro) {
		this.marcaCarro = marcaCarro;
	}
	
	public void exibeCarro() {
		System.out.print("O seu carro é "+ getNome()+" do tipo "+getTipo()
						+"\nModelo: "+getModeloCarro()+"\nMarca: "+getMarcaCarro());
						
	}
	
	

}
