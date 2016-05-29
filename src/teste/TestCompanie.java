package teste;

import static org.junit.Assert.*;

import org.junit.Test;
import clase.*;

public class TestCompanie {

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
		assertEquals("Serra Software", companie.getDenumire());
		assertEquals("Bucuresti", companie.getOras());
		assertEquals(9, companie.getNumarAngajati());
		assertEquals(generalManager.getNume(), companie.getGeneralManager().getNume());
		
		generalManager=companie.getGeneralManager();
		assertEquals("Calin", generalManager.getNume());
		assertNotNull(director.getAngajati());
		assertEquals(2L, generalManager.getAngajati().size());
		assertTrue(generalManager.copil(0) instanceof Administrator);
		assertTrue(generalManager.copil(1) instanceof DirectorDepartamentAdapter);
		assertEquals("Maria", generalManager.copil(0).getNume());
		assertEquals("Andreea", generalManager.copil(1).getNume());
		DirectorDepartamentAdapter director2=(DirectorDepartamentAdapter) generalManager.copil(1);
		assertEquals(3L, director2.getAngajati().size());
		assertEquals("Laura", director2.copil(0).getNume());
		assertEquals("Paula", director2.copil(1).getNume());
		assertEquals("Elena", director2.copil(2).getNume());
	}

}
