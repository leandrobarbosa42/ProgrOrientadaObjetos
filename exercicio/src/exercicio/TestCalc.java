package exercicio;


public class TestCalc {
public static void main(String[] args) {
	Calculadora calc = new Calculadora();
	//somar
	calc.somar(5, 3.7);
	System.out.println(calc.res);
	//subtrair
	calc.subtrair(18.4, 23.2);
	System.out.println(calc.res);
	//multiplicar e soma
	calc.multiplicar(7, 1.5);
	calc.somar(calc.res, 4.2);
	System.out.println(calc.res);
	//divisão e soma
	calc.dividir(13.8, 4.2);
	calc.somar(calc.res, 1.8);
	System.out.println(calc.res);
}
}
