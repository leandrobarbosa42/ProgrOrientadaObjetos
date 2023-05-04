package exercicio2;

public class Bebida extends Produto {
	private double volume;
	
	public Bebida(int a, String b, int c, double d){
		super(a, b, c);
		volume = d;
	}
	
	public void mostrarDados(){
		super.mostrarDados();
		String texto = "Volume: %.2f gr";
		String txt= String.format(texto, volume);
		System.out.println(txt);
	}
	
	public void setVolume(double v){
		this.volume = v;
	}
	public double getVolume(){
		return volume;
	}
}
