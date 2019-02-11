import static org.junit.Assert.*;

import org.junit.Test;

public class Circulo_SGMTest {


	Circulo_SGM circulo1 = new Circulo_SGM(7,"");
	Circulo_SGM circulo2 = new Circulo_SGM(0,"");
	Circulo_SGM circulo3 = new Circulo_SGM(-3,"");
	
	@Test
	public void testArea() {
		
		double area1 = circulo1.area();
		assertEquals(153.9384,area1,0);
		
		double area2 = circulo2.area();
		assertEquals(0,area2,0);
		
		double area3 = circulo3.area();
		assertEquals(28.2744,area3,0);
	}

	@Test
	public void testPerimetro() {
		
		double perimetro1 = circulo1.perimetro();
		assertEquals(43.9824,perimetro1,0);
		
		double perimetro2 = circulo2.perimetro();
		assertEquals(0,perimetro2,0);
		
		double perimetro3 = circulo3.perimetro();
		assertEquals(18.8496,perimetro3,0);
	}

}
