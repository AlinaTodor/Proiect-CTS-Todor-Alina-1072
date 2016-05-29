package clase;

public class Implementare extends Atribut{
	
	public Implementare() {
		super();
	}
	
	

	@Override
	public String toString() {
		return "Implementare [client=" + client + ", durata=" + durata + ", pret=" + pret + "]";
	}



	@Override
	public void serviciu() {
		client.procesareClient();
		
	}
	
}