package teste;

import static org.junit.Assert.*;

import org.junit.Test;
import clase.*;

public class TestAngajat {

	@Test
	public void test() {
		Consultant consultant=new Consultant("Paula");
		assertEquals("Paula", consultant.getNume());
		
		DirectorDepartamentAdapter director=new DirectorDepartamentAdapter("Andreea");
		assertEquals("Andreea", director.getNume());
		director.adauga(consultant);
		assertNotNull(director.getAngajati());
		assertEquals(1L, director.getAngajati().size());
		assertEquals("Paula", director.copil(0).getNume());
		
		Administrator administrator=new Administrator("Maria");
		assertEquals("Maria", administrator.getNume());
		
		GeneralManager generalManager=new GeneralManager("Calin");
		assertEquals("Calin", generalManager.getNume());
		generalManager.adauga(director);
		generalManager.adauga(administrator);
		assertNotNull(generalManager.getAngajati());
		assertEquals(2L, generalManager.getAngajati().size());
	}
	
}
