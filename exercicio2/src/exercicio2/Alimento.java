package exercicio2;

public class Alimento extends Produto {
	private double peso;
	
	public Alimento(int a, String b, int c, double d){
	super(a,b,c);	
	peso = d;	
	}
	
	public void mostrarDados() {
		super.mostrarDados();
		String texto = "Peso: %.2f";
		String txt = String.format(texto, peso);
		System.out.println(txt);
	}
	
	public void setPeso(double p) {
		this.peso = p;
	}
	public double getPeso(){
		return peso;
	}
	
	
}

