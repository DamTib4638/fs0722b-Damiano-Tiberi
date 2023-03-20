package incendi;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import incendi.model.Sonda;

public class SondaTest {
	
	Sonda s = new Sonda();
	
	@Before
	public void introTest() {
		s.setId(1l);
		s.setLatitudine(10.0);
		s.setLongitudine(20.0);
		s.setValoreFumo(9);
	}

	@Test
	public void testGetId() {
		assertEquals(1, s.getId());
	}

	@Test
	public void testGetLatitudine() {
		assertEquals(10.0, s.getLatitudine(), 0.1);
	}

	@Test
	public void testGetLongitudine() {
		assertEquals(20.0, s.getLongitudine(), 0.1);
	}

	@Test
	public void testGetValoreFumo() {
		assertEquals(9, s.getValoreFumo());
	}

}
