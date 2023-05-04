package exercicio;

public class Calculadora {
	public double n1;
	public double n2;
	public double res;
	
	public void somar(double a, double b) {
		n1 = a;
		n2 = b;
		res = n1+n2;
	}
	public void subtrair(double a, double b) {
		n1 = a;
		n2 = b;
		res = n1-n2;
	}
	public void dividir(double a, double b) {
		n1 = a;
		n2 = b;
		res = n1/n2;
	}
	public void multiplicar(double a, double b) {
		n1 = a;
		n2 = b;
		res = n1*n2;
	}
}
