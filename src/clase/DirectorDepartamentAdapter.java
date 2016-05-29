package clase;

import java.util.ArrayList;
import java.util.List;

public class DirectorDepartamentAdapter extends Angajat{
	
	private Consultant consultant;
	private List<Angajat> angajati;
	
	public DirectorDepartamentAdapter(String nume) {
		super(nume);
		consultant=new Consultant(nume);
		angajati=new ArrayList<Angajat>();
	}

	@Override
	public void adauga(Angajat angajat) {
		angajati.add(angajat);
		
	}

	@Override
	public void sterge(Angajat angajat) {
		angajati.remove(angajat);	
	}

	@Override
	public Angajat copil(int i) {
		return angajati.get(i);
	}
	
		
	public List<Angajat> getAngajati() {
		return angajati;
	}

	public void sedinta(){
		System.out.println("Directorul de departament a convocat sedinta!");
	}
	
}
