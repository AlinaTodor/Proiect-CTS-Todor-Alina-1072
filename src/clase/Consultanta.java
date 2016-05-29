package clase;

public class Consultanta extends Atribut{
	
	public Consultanta() {
		super();
	}
	
	

	@Override
	public String toString() {
		return "Consultanta [client=" + client.toString() + ", durata=" + durata + ", pret=" + pret + "]";
	}



	@Override
	public void serviciu() {
		client.procesareClient();
	}
	
}
