package JavaOO2;

public class Principal {

	public static void main(String[] args) {
		ParticipanteForum participante = new ParticipanteForum();
		Leitor leitor = participante;//upcast
		System.out.println("O Participante esta lendo "+leitor.lendo());
		Programador programador = participante;//upcast
		String java = "Java";
		programador.pensando(java.toCharArray());
		System.out.println("E programando "+ programador.digitando());

	}

}
