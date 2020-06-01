package JavaOO;

public class TelefoneCelular extends Telefone {
	
	public TelefoneCelular()
	{
		super("Celular");
	}
	
	public void toca(int codigoToque)
	{
		switch (codigoToque)
		{
			case 1:
				System.out.println("Roque,Roque,Roque...");
				break;
			case 2:
				System.out.println("Blim,Blim,Blim...");
				break;
				
				default: System.out.println("Trim.trim,trim...");
				break;
			
		}
		
	}
	public void disca(String numero)
	{
		System.out.println("O numero: "+numero+ " é um celular.");
	}

}
