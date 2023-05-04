package exercicio2;

import java.util.ArrayList;

public class teste {

	public static void main(String[] args) {
		/*ArrayList<Bebida> estoque = new ArrayList<Bebida>();
		Bebida pdt;
		
		pdt = new Bebida(512, "Chave", 7, 2.5);
		estoque.add(pdt);
		pdt = new Bebida(1248, "Cola", 45,0.3);
		estoque.add(pdt);
		pdt = new Bebida(78, "Papel", 320,5.2);
		estoque.add(pdt);
		pdt = new Bebida(114720, "Tonner",3, 7.0);
		estoque.add(pdt);
		

		int a = estoque.size();
		for(int x = 0; x < a; x++) {
			estoque.get(x).mostrarDados();
		}
		*/
		Data dt = new Data(1993, 5, 2);
		System.out.println(dt.getData());
		
		dt.alterarData(2024, 13, 28);
		System.out.println(dt.getData());
	}
}
