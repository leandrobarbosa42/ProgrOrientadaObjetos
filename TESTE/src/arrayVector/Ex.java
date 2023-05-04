package arrayVector;

public class Ex {
	public int atrib01;
	public String atrib02;
	public double atrib03;
	public Ex(int i, String s, double d) {
		atrib01 = i;
		atrib02 = s;
		atrib03 = d;
	}
	public void mostraCT() {
		System.out.println(atrib01 +": "+ atrib02 +"("+ atrib03 +")");
	}
}