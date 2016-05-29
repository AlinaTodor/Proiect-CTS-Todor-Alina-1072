package clase;

import java.util.ArrayList;
import java.util.List;

public class GeneralManager extends Angajat{

	private List<Angajat> angajati;
	
	public GeneralManager(String nume) {
		super(nume);
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

	@Override
	public String toString() {
		String s="";
		for(Angajat angajat: angajati){
			s+=angajat.toString()+" ";
		}
		return "General manager [ nume=" + nume +"]";
	}

}