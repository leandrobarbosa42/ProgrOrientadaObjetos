package exercicio;

public class ClasseC {
	
	public void interFor(int a, int b) {
		String txt = "";
		for(int x=a;x<=b;x++){
			txt += x;
			if(x != b) {txt += ",";}
		}
		System.out.println(txt);
	}
	
	public void interWhile(int a, int b) {
		String txt = "";
		int cont = 0;
		while(a<=b) {
			txt+= a;
			if(a != b){txt+= ",";}
			if(cont == 1){
				txt+= "\n";
				cont = 0;
			}else {
				cont++;
			}
			a++;
		}
		System.out.println(txt);
	}
	
	public void chamarMetodos(int a, int b) {
		System.out.println("Resultado com for: ");
		interFor(a,b);
		System.out.println("Resultado com while: ");
		interWhile(a,b);
	}
}
