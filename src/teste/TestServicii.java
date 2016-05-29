package teste;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import clase.*;
import clase.Serviciu.serviciu;

public class TestServicii {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}
	
	@Test
	public void test() {
		String sep=System.getProperty("line.separator");
		IMM MGT=new IMM("MGT", "Bucuresti", serviciu.Consultanta);
		Factory serviciuFactory=new Factory();
		Consultanta consultanta=(Consultanta) serviciuFactory.getServiciu(serviciu.Consultanta, 1000, MGT, 12);
		assertEquals(MGT.getNume(), consultanta.getClient().getNume());
		assertEquals(12L, (long)consultanta.getDurata());
		assertEquals(1000L, (long)consultanta.getPret());
		consultanta.serviciu();
		String expected="IMM-ul "+MGT.toString()+" solicita un nou serviciu "+serviciu.Consultanta.toString();
		expected+=sep;
		expected+="IMM-ul "+MGT.toString()+" a acceptat serviciul "+serviciu.Consultanta.toString();
		expected+=sep;
		expected+="IMM-ul "+MGT.toString()+" a achitat serviciul "+serviciu.Consultanta.toString()+sep;
		assertEquals(expected, outContent.toString());
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	    System.setErr(null);
	}

	

}
