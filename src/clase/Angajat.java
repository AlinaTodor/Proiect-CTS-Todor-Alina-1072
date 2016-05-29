package clase;

public abstract class Angajat {
	public abstract void adauga(Angajat angajat);
	public abstract void sterge(Angajat angajat);
	public abstract Angajat copil(int i);
	protected String nume;
	
	public Angajat(String nume) {
		super();
		this.nume = nume;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	@Override
	public String toString() {
		return "Angajat [nume=" + nume + "]";
	}
	
	
}

