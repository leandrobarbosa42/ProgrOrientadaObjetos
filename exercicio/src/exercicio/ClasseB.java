package exercicio;

public class ClasseB {
	public double a2;
	public double a1;
	public static void main(String[] args){
		ClasseB cb = new ClasseB();
		
		cb.a1 = 2.3;
		cb.a2 = 4.6;
		cb.mostrarValores();
	}
	public void mostrarValores(){
		System.out.println("Valor de a1: "+a1+"\n");
		System.out.println("Valor de a1: "+a2+"\n");
   }
}
