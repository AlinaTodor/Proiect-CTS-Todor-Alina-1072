package clase;

public class Dezvoltare extends Atribut{
	
	public Dezvoltare() {
		super();
	}

	

	@Override
	public String toString() {
		return "Dezvoltare [client=" + client.toString() + ", durata=" + durata + ", pret=" + pret + "]";
	}



	@Override
	public void serviciu() {
		client.procesareClient();
	}
	
}