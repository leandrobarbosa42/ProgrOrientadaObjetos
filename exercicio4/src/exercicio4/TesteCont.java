package exercicio4;

public class TesteCont {

	public static void main(String[] args) {
		Contagem c1 = new Contagem("C1");
		Contagem c2 = new Contagem("C2");
		//Rodar individual
		c1.run();
		c2.run();
		//Rodar thread
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		t1.start();
		t2.start();
	}

}
