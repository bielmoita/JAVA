package Ex2Model;

public class Motocicleta extends Veiculo {
	private String modeloMoto;
	private String marcaMoto;
	
	
	public String getModeloMoto() {
		return modeloMoto;
	}

	public void setModeloMoto(String modeloMoto) {
		this.modeloMoto = modeloMoto;
	}

	public String getMarcaMoto() {
		return marcaMoto;
	}

	public void setMarcaMoto(String marcaMoto) {
		this.marcaMoto = marcaMoto;
	}




	public void exibeMoto() {
		System.out.print("A sua motocicleta é "+ getNome()+" do tipo "+getTipo()
						+"\nModelo: "+getModeloMoto()+"\nMarca: "+getMarcaMoto());
						
	}

}
