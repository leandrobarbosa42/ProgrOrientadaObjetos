package exercicio4;

public class Contagem implements Runnable{
	private String id = "";
	
	public void run() {
		System.out.println("Iniciando para" +id+ ":");
		for(int x = 1; x < 10; x++) {
			System.out.println(id+ ":"+x);
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {}
		}
	}
	public Contagem(String s) {
		id = s;
	}
}
