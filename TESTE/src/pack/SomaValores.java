package pack;

public class SomaValores {
	public int resultInt;
	public double resultDouble;
	
	public int somarInteiros(int a, int b) {
		int result = a+b;
		resultInt = result;
		return result;
	}
	
	public double somarReais(double a, double b) {
		double result = a+b;
		resultDouble = result;
		return result;
	}
	public void mostrarResultado() {
		String txt ="--------------------------\n";
		txt +="Soma Inteiros: " + resultInt + "\n";
		txt +="Soma Reais: " + resultDouble + "\n";
		System.out.println(txt);
	}
	public static void main(String[] args) {
		SomaValores sv = new SomaValores();
		int vi = sv.somarInteiros(7,15);
		System.out.println(vi);
		double vd = sv.somarReais(3.9, 9.5);
		System.out.println(vd);
		sv.mostrarResultado();
	}
}
