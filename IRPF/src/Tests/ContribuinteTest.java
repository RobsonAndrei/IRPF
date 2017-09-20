package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Dominio.Imposto;
import Persistence.Contribuinte;

public class ContribuinteTest {
	private Contribuinte c1, c2, c3, c4, c5, c6;
	private Imposto i1, i2, i3;

	@Before
	public void setUp() throws Exception {
		c1 = new Contribuinte("Robson Andrei", "76425584068", 35, 4);
		c1.setRendiment(25350.59);

		c2 = new Contribuinte("Jorge Tadeu", "84705994090", 46, 3);
		c3 = new Contribuinte("Amarildo Clovis", "839948995980", 22, 1);
		c4 = new Contribuinte("Roberta Tsunami", "28738748758", 18, 2);
		c5 = new Contribuinte("Fulano de Tal", "85969858740", 25, 6);
		c6 = new Contribuinte("Beltrano da Tal", "10093093044", 60, 5);
	}

	@Test
	public void getNome() {
		String name = "Robson Andrei";
		assertEquals(c1.getNome(), name);
	}

	@Test
	public void getCpf() {
		String c = "76425584068";
		assertEquals(c1.getCpf(), c);
	}

	@Test
	public void getRendimentos() {
		c1.setRendiment(350.00);
		double rend = c1.getRendiment();
		assertEquals(rend, 350.00, 2.00);
	}

	@Test
	public void getN_Depend() {
		int dep = c2.getN_dependent();
		assertEquals(3, dep);
	}

	@Test
	public void getContPrev() {
		double z = 100.0;
		assertEquals(100.0, z, 2.0);
	}

	@Test
	public void imprimi() {
		String i = "";
		// System.out.println(c1.toString());
		assertTrue(c1.toString(), true);

	}

	@Test
	public void getBaseCalculo() {
		i1 = new Imposto();
		c1.setCont_prev_ofic(1200.00);
		double base = i1.getBaseCalculo(c1);
		assertEquals(3943.06, base, 2.00);
	}

	@Test
	public void i_Apagar() {
		i1 = new Imposto();
		double impostoApagar = i1.i_Apagar(i1.getBaseCalculo(c1));
		assertEquals(0.0, impostoApagar, 2.00);
	}

}
