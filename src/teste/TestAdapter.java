package teste;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import clase.Consultant;
import clase.DirectorDepartamentAdapter;

public class TestAdapter {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final String sep = System.getProperty("line.separator");

	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}

	@Test
	public void test() {
		Consultant consultant=new Consultant("Paula");
		assertEquals("Paula", consultant.getNume());
		Consultant consultant2=new Consultant("Alina");
		assertEquals("Alina", consultant2.getNume());
		
		DirectorDepartamentAdapter director=new DirectorDepartamentAdapter("Paula");
		assertEquals(director.getNume(), consultant.getNume());
		director.adauga(consultant2);
		assertNotNull(director.getAngajati());
		assertEquals(1L, director.getAngajati().size());
		assertEquals("Alina", director.copil(0).getNume());
		director.sterge(consultant2);
		assertNotNull(director.getAngajati());
		assertEquals(0, director.getAngajati().size());
		director.sedinta();
		assertEquals("Directorul de departament a convocat sedinta!"+sep, outContent.toString());
	}
	
	@After
	public void cleanUpStreams() {
		System.setOut(null);
		System.setErr(null);
	}

}
