package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Administrator;
import clase.Companie;
import clase.Consultant;
import clase.DirectorDepartamentAdapter;
import clase.GeneralManager;

public class TestBuilder {

	@Test
	public void test() {
		Administrator administrator=new Administrator("Maria");
		Consultant consultant1=new Consultant("Laura");
		Consultant consultant2=new Consultant("Paula");
		Consultant consultant3=new Consultant("Elena");
		GeneralManager generalManager=new GeneralManager("Calin");
		DirectorDepartamentAdapter director=new DirectorDepartamentAdapter("Andreea");
		
		generalManager.adauga(administrator);
		generalManager.adauga(director);
		
		director.adauga(consultant1);
		director.adauga(consultant2);
		director.adauga(consultant3);
		
		Companie companie= new Companie.CompanieBuilder("Serra Software").Oras("Bucuresti").NumarAngajati(9).GeneralManager(generalManager).build();
		assertNotNull(companie);
		assertEquals("Serra Software", companie.getDenumire());
		assertEquals("Bucuresti", companie.getOras());
		assertEquals(9, companie.getNumarAngajati());
		assertEquals(generalManager.getNume(), companie.getGeneralManager().getNume());
	}

}
