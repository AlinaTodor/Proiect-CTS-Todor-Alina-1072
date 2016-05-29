package teste;

import static org.junit.Assert.*;

import org.junit.Test;
import clase.*;
import clase.Serviciu.serviciu;

public class TestFactory {

	@Test
	public void test() {
		float pret=100;
		float durata =12;
		IMM client=new IMM("MGT", "Bucuresti", serviciu.Consultanta);
		
		Factory factory=new Factory();			
		Consultanta consultanta=(Consultanta) factory.getServiciu(serviciu.Consultanta, pret, client, durata);
		assertNotNull(consultanta);
		assertTrue(consultanta instanceof Consultanta);
		assertEquals("MGT", consultanta.getClient().getNume());
		assertEquals((long)durata, (long)consultanta.getDurata());
		assertEquals((long)pret, (long)consultanta.getPret());
		
		Dezvoltare dezvoltare=(Dezvoltare) factory.getServiciu(serviciu.Dezvoltare, pret, client, durata);
		assertNotNull(dezvoltare);
		assertTrue(dezvoltare instanceof Dezvoltare);
		assertEquals("MGT", dezvoltare.getClient().getNume());
		assertEquals((long)durata, (long)dezvoltare.getDurata());
		assertEquals((long)pret, (long)dezvoltare.getPret());
		
		Implementare implementare=(Implementare) factory.getServiciu(serviciu.Implementare, pret, client, durata);
		assertNotNull(implementare);
		assertTrue(implementare instanceof Implementare);
		assertEquals("MGT", implementare.getClient().getNume());
		assertEquals((long)durata, (long)implementare.getDurata());
		assertEquals((long)pret, (long)dezvoltare.getPret());
		
		Suport suport=(Suport) factory.getServiciu(serviciu.Suport, pret, client, durata);
		assertNotNull(suport);
		assertTrue(suport instanceof Suport);
		assertEquals("MGT", suport.getClient().getNume());
		assertEquals((long)durata, (long)suport.getDurata());
		assertEquals((long)pret, (long)suport.getPret());
	}

}
