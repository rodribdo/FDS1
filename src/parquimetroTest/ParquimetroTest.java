package parquimetroTest;
import parquimetro.Parquimetro;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ParquimetroTest {
	private Parquimetro parq;
	
	@Before
	public void setUp() throws Exception {
	parq = new Parquimetro();
	parq.insereMoeda(100);
	}
	
	@Test
	public void testInsereMoeda() {
	parq.insereMoeda(1);
	parq.insereMoeda(5);
	parq.insereMoeda(10);
	parq.insereMoeda(25);
	parq.insereMoeda(50);
	parq.insereMoeda(100);
	//double actualsaldo = parq.getSaldo();
	assertTrue(Math.abs(291 - parq.getSaldo())<1.0);
	}
	
	@Test
	public void testGetSaldo() {
	double actual = parq.getSaldo();
	assertTrue(Math.abs(100 - actual)<1.0);
	}
	
	@Test
	public void testEmiteTicket() {
	parq.insereMoeda(50);
	parq.insereMoeda(50);
	parq.insereMoeda(100);
	boolean actual = parq.emiteTicket();
	assertEquals(true, actual);
	}
	
	@Test
	public void testDevolve() {
	parq.insereMoeda(50);
	parq.insereMoeda(50);
	parq.insereMoeda(100);
	parq.emiteTicket();
	double actual = parq.devolve();
	assertTrue(Math.abs(100 - actual)<1.0);
	}

}
