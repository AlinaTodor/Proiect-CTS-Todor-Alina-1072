package teste;

import static org.junit.Assert.*;

import org.junit.Test;
import clase.*;
import clase.Serviciu.serviciu;

public class TestClient {

	@Test
	public void test() {
		IMM imm=new IMM("imm", "Bucuresti", serviciu.Consultanta);
		assertNotNull(imm);
		assertEquals("imm", imm.getNume());
		assertEquals("Bucuresti",imm.getOras());
		assertEquals(serviciu.Consultanta.toString(), imm.getSrv().toString());
		
		Multinationala multinationala=new Multinationala("multinationala", "Bucuresti", serviciu.Consultanta);
		assertNotNull(multinationala);
		assertEquals("multinationala", multinationala.getNume());
		assertEquals("Bucuresti",multinationala.getOras());
		assertEquals(serviciu.Consultanta.toString(), multinationala.getSrv().toString());
	}

}
