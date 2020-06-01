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
	public String lendo() { //m�todo definido na interface do leitor
		return "Livro";
	}
	
	public void pensando(char[] ideias) {//M�todo definido na interface Programador
		pensamento = new String(ideias);
	}
	
	public String digitando() {//M�todo definido na interface Programador
		return pensamento;
	}
	
	private String aprendendo() { //M�todo exclusivo deta classe
		return "Java";
	}
}
