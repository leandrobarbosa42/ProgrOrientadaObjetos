package exercicio4;

public class TesteCont2 {

	public static void main(String[] args) {
		Cont2 C1 = new Cont2("A");
		Cont2 C2 = new Cont2("B");
		
		Thread t1 = new Thread(C1);
		Thread t2 = new Thread(C2);
		
		t1.start();
		t2.start();
	}

}
