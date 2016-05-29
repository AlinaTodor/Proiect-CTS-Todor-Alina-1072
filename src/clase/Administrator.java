package clase;


public class Administrator extends Angajat{

	public Administrator(String nume) {
		super(nume);
	}

	@Override
	public void adauga(Angajat angajat) {
		
	}

	@Override
	public void sterge(Angajat angajat) {
		
	}

	@Override
	public Angajat copil(int i) {
		return null;
	}

	@Override
	public String toString() {
		return "Administrator [nume=" + nume + "]";
	}
	
	

}
