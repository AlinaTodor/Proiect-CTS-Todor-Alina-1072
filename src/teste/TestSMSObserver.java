package teste;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import clase.Consultanta;
import clase.IMM;
import clase.SMSObserver;
import clase.Serviciu.serviciu;

public class TestSMSObserver {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final String sep=System.getProperty("line.separator");

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}
	
	
	@Test
	public void test() {
		IMM imm=new IMM("imm", "Bucuresti", serviciu.Consultanta);
		assertNotNull(imm);
		assertEquals("imm", imm.getNume());
		assertEquals("Bucuresti",imm.getOras());
		assertEquals(serviciu.Consultanta.toString(), imm.getSrv().toString());
		
		SMSObserver observer=new SMSObserver(imm);
		observer.update(serviciu.Consultanta, 1);
		String expected=observer.getClient().toString()+ "care a solicitat serviciul "+serviciu.Consultanta.toString() + " a fost anuntat prin sms";
		expected+=sep;
		expected+="Serviciul a fost solicitat";
		expected+=sep;
		assertEquals(expected, outContent.toString());
		
		observer.update(serviciu.Consultanta, 2);
		String expected2=expected;
		expected2+=observer.getClient().toString()+ "care a solicitat serviciul "+serviciu.Consultanta.toString() + " a fost anuntat prin sms";
		expected2+=sep;
		expected2+="Serviciul a fost acceptat de client";
		expected2+=sep;
		assertEquals(expected2, outContent.toString());
		
		observer.update(serviciu.Consultanta, 3);
		String expected3=expected2;
		expected3+=observer.getClient().toString()+ "care a solicitat serviciul "+serviciu.Consultanta.toString() + " a fost anuntat prin sms";
		expected3+=sep;
		expected3+="Serviciul a fost achitat";
		expected3+=sep;
		assertEquals(expected3, outContent.toString());
	}
	
	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	    System.setErr(null);
	}


}
