package exercicio3;

public abstract class StrEspecial {
	public StrEspecial() {}
	
	public static String trimGeral(String s) {
		String txt = s.trim().replaceAll("\\s+", " ");
		return txt;
	}
	public static String trimToUp(String s) {
		String txt = s.toUpperCase();
		return txt;
	}
	public static String trimToLower(String s) {
		String txt = s.toLowerCase();
		return txt;
	}
}
