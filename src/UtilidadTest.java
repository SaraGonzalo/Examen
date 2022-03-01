import static org.junit.Assert.*;

import org.junit.Test;

public class UtilidadTest {
	//método de pruba por cada valor de a
	
	
	@Test
	public void cP1() {
		Utilidad u=new Utilidad();
		long esperado=0;
		long resultado=u.ejercicioD(0);
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void cP2() {
		Utilidad u=new Utilidad();
		long esperado=4;
		long resultado=u.ejercicioD(2);
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void cP3() {
		Utilidad u=new Utilidad();
		long esperado=9;
		long resultado=u.ejercicioD(3);
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void cP4() {
		Utilidad u=new Utilidad();
		long esperado=28;
		long resultado=u.ejercicioD(4);
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void cP5() {
		Utilidad u=new Utilidad();
		long esperado=125;
		long resultado=u.ejercicioD(5);
		assertEquals(esperado,resultado);
	}

}
