package exercicio4;

import java.util.Random;

public class Cont2 implements Runnable {
	private String id;
	
	public void run() {
		Random rndm = new Random();
		System.out.println("Iniciando Contagem");
		for(int x =1; x<=10; x++) {
			System.out.println("Contagem "+id+": " + x);
		try {
			int time = rndm.nextInt(10)+1;
			Thread.sleep(time*100);	
			Thread.yield();
		}catch(InterruptedException e) {}
		}
	}
	public Cont2(String a){
		id = a;
	}
}
