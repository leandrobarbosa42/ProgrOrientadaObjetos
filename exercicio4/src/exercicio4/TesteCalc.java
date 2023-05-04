package exercicio4;

public class TesteCalc {

	public static void main(String[] args) {
		double tst = (double)5/(double)0;
		System.out.println(tst);
		try {
			System.out.println(Calculadora.dividir(24, 0));
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
