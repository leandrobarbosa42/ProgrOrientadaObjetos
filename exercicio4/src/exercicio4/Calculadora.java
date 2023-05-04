package exercicio4;

public abstract class Calculadora {
	public static double dividir(double a, double b) throws Exception {
		double c;
		if(b == 0) {
			throw new Exception("Valor inapropriado - Zero");
					}
		c= a/b;
		return c;
	}
}

