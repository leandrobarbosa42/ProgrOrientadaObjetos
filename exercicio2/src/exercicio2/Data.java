package exercicio2;

public class Data {
	private int dia, mes, ano;
	private boolean bissexto;
	
	private boolean setDia(int d) {
		
		int x;
		switch(mes) {
		case 2:
			if(bissexto) { 
				x = 29;
			    break;} else x = 28;	break;
		case 4, 6, 9, 11:
			x = 30;
			break;
		default:
			x = 31;
			break;
		}
		
		if(d < 1 || d > x) {
			System.out.println("Data invalida!!!");
			return false;
		} else 
			this.dia = d;
		return true;
	}
	public int getDia() {
		return dia;
	}
	private boolean setMes(int m) {
		if(m < 1 || m > 12) {
			System.out.println("Data invalida!!!");
			return false;
		} else 
			this.mes = m;
		return true;
	}
	public int getMes() {
		return mes;
	}
	private boolean setAno(int a) {
		
		if(a < 1) {
			System.out.println("Data invalida!!!");
			return false;
		} else 
			if( a%4 == 0) {
				this.bissexto = true;
				System.out.println("Ano bissexto.");
			} else bissexto = false;
			this.ano = a;
		return true;
	}
	public int getAno() {
		return ano;
	}
	public boolean getBissexto() {
		return bissexto;
	}

	public void alterarData(int a, int b, int c) {
		int d0 = dia;
		int m0 = mes;
		int a0 = ano;
		boolean x = false;
		
		x = setAno(a);
		if(x)x = setMes(b);
		if(x)x = setDia(c);
	    if(!x) {
	    	dia = d0;
	    	mes = m0;
	    	ano = a0;
	    }
	}
	
	public Data(int a, int b, int c){
		dia = 1;
		mes = 1;
		ano = 1;
		alterarData(a, b, c);
	}
	
	public String getData() {
		String texto = "A data é: %02d/%02d/%04d";
		String txt = String.format(texto, dia, mes, ano);
		return txt;
		
	}
}
