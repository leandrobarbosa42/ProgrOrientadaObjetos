package quest;

public class testeQ {

	public static void main(String[] args) {
		int a=3, b=0;
		try {
			int c = a / b;
			System.out.println("c= "+c);
		} catch(ArithmeticException e) {
			System.out.println("Erro de calculo!");
		}
	System.out.println("Fim!");
	}
}
