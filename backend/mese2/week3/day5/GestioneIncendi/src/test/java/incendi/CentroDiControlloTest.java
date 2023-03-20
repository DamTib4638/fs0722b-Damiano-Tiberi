package incendi;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import incendi.model.CentroDiControllo;
import incendi.model.Dispositivo;
import incendi.model.Sonda;

public class CentroDiControlloTest {
	
	Sonda s = new Sonda();
	List<Dispositivo> listaSonde = new ArrayList<Dispositivo>();
	CentroDiControllo c = new CentroDiControllo();
	String testAllarmato = "Pericolo Incendio rilevato dalla sonda 1.";
	String testTranquillo = "Nessun pericolo incendio rilevato dalla seguente sonda: 1.";
	
	@Before
	public void BeforeTest() {
		s.setId(1);
		s.setLatitudine(3.0);
		s.setLongitudine(5.0);
		s.setValoreFumo(9);
		listaSonde.add(s);
	}

	@Test
	public void testComunicaPericoloIncendio() {
		assertTrue(c.comunicaPericoloIncendio(listaSonde).contains(testAllarmato));
	}

}
