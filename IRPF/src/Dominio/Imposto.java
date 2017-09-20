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

	public double i_Apagar(double baseCalculo) {
		if (baseCalculo <= 12000.00) {
			System.out.println("Contribuinte isento");
			return 0.0;
		} else {
			if (baseCalculo > 12000.00 && baseCalculo < 24000.00) {
				double result = baseCalculo - 12000.00;
				System.out.println(result * 0.15);
				return (result * 0.15);
				

			} else {
				if (baseCalculo >= 24000.00) {
					double result = baseCalculo - 12000.00;
					double aux  = (result * 0.15);
					System.out.println(aux + ((baseCalculo - 24000.00) * 0.275));
					return aux + ((baseCalculo - 24000.00) * 0.275);
				}
			}
		}
		return 0;
	}

}
