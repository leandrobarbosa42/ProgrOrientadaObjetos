package exercicio;

public class Verificadora {
	public String veriImparPar(int x) {
		String resposta = "";
		if(x == 0) {
			resposta ="NULO";}
		else if(x%2==0) {
			resposta="PAR";
		}
		else {
			resposta="IMPAR";
		}
		return resposta;
	}
	
	
	public String veriPosiNeg(int x) {
		String res = "ZERO";
		if(x != 0){
			res="POSITIVO";
			if(x < 0) {
				res = "NEGATIVO";
			}
		}
		return res;
	}
	
	public void veriValor(int x) {
		String txt = "O número "+x;
		txt += " é "+ veriPosiNeg(x);
		txt += " e tem modulo "+ veriImparPar(x)+".";
		System.out.println(txt);
	}
}
