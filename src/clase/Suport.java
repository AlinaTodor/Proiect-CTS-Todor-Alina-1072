package clase;

public class Suport extends Atribut{
	
	public Suport() {
		super();
	}

	

	@Override
	public String toString() {
		return "Suport [client=" + client.toString() + ", durata=" + durata + ", pret=" + pret + "]";
	}



	@Override
	public void serviciu() {
		client.procesareClient();
		
	}

}