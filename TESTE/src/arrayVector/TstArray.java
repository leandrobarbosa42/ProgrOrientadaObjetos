package arrayVector;

import java.util.ArrayList;

public class TstArray{
public static void main(String[] args) {
	
	ArrayList<Ex> conjunto = new ArrayList<Ex>();
	Ex ct;
	ct = new Ex(1,"primeiro",2.5);
	conjunto.add(ct);
	
	conjunto.get(0).mostraCT();
}
}