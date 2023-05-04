package pack;

public class TesteSwitch {
public static void main(String[] args) {
 int x = 5;
  switch(x) {
 case 1:
 System.out.println("O valor de x é igual a 1");
 break;
 case 2:
 System.out.println("O valor de x é igual a 2");
 break;
 case 3:
 System.out.println("O valor de x é igual a 3");
 break;
 default:
 System.out.println("O valor de x é maior que 3");
 System.out.println("...ou menor que 1");
 break;
 }


// laço for
for (int y = 1; y <= 10; y++) {
System.out.println(y);
}
// array - colocar tipo de variavel que vai conter
int[] a = new int[3];
a[0]= 4;
a[1]= 7;
a[2]= 5;
//acessando o array com for
for(int z = 0; z < a.length; z++) {
	System.out.println("----------------------------------------------\n");
	System.out.println(a[z]);
}

}
}