package Dominio;
import Persistence.Contribuinte;


public class Imposto {
	
	public Imposto() {
		
	}

	public double getBaseCalculo(Contribuinte c1) {
		double base = c1.getRendiment() - c1.getCont_prev_ofic();
		double aux = base * 0.05;
		base = base - aux;

		return base;
	}

}
