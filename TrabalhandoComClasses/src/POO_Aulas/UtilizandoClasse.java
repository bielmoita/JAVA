package POO_Aulas;

public class UtilizandoClasse {
	public static void main(String[] args)
	{
		//variaveis que ser�o parametros do m�todo construtor
		String cor="n�o sei";
		String marca="n�o sei tamb�m";
		
		//Instanciando a Classe Carro
		//Criando o objeto meuCarro
		
		
		Carro meucarro = new Carro(cor, marca);
		//Executando o m�todo
		meucarro.mostraMarcaCor();
		
		//Trocando a cor do carro
		meucarro.setCor("Vermelho");
		
		//Executando o m�todo
		meucarro.mostraMarcaCor();
		
		marca = "FIAT";
		meucarro.setMarca(marca);
		
		//Executando o m�todo
		meucarro.mostraMarcaCor();
		
		
		
		
	}

}
