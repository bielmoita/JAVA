package JavaOO2;

public interface Leitor {
	
	String lendo();

}

interface Programador {
	void pensando(char[] ideias);
	String digitando();
}

class ParticipanteForum implements Leitor, Programador {
	String pensamento;
	public String lendo() { //método definido na interface do leitor
		return "Livro";
	}
	
	public void pensando(char[] ideias) {//Método definido na interface Programador
		pensamento = new String(ideias);
	}
	
	public String digitando() {//Método definido na interface Programador
		return pensamento;
	}
	
	private String aprendendo() { //Método exclusivo deta classe
		return "Java";
	}
}
