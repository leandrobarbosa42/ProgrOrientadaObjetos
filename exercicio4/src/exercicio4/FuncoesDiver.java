package exercicio4;

public abstract class FuncoesDiver {
	public static Boolean ehNumero(String a) {		
		try {
			double b = Double.parseDouble(a); 
		} catch(Exception e){	return false;		}
		return true;
 	}
}
