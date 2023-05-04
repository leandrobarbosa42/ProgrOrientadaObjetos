package exercicio4;

import javax.swing.JOptionPane;

public class TesteFD {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog(null, "Digite um número: ", "Entrada de dados", JOptionPane.INFORMATION_MESSAGE);
		double b = -1;
		if(FuncoesDiver.ehNumero(a)){
			b = Double.parseDouble(a);
		};
		System.out.println(b);
	}

}
