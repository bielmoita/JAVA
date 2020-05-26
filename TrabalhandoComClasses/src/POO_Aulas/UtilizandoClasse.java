package POO_Aulas;

public class UtilizandoClasse {
	public static void main(String[] args)
	{
		//variaveis que serão parametros do método construtor
		String cor="não sei";
		String marca="não sei também";
		
		//Instanciando a Classe Carro
		//Criando o objeto meuCarro
		
		
		Carro meucarro = new Carro(cor, marca);
		//Executando o método
		meucarro.mostraMarcaCor();
		
		//Trocando a cor do carro
		meucarro.setCor("Vermelho");
		
		//Executando o método
		meucarro.mostraMarcaCor();
		
		marca = "FIAT";
		meucarro.setMarca(marca);
		
		//Executando o método
		meucarro.mostraMarcaCor();
		
		
		
		
	}

}
