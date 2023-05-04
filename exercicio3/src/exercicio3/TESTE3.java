package exercicio3;

public class TESTE3 {
	public static void main(String[] args) { 
		/*PessoaFisica p1 = new PessoaFisica();
		p1.cadastrarPessoa();
		p1.mostrarDados();*/
		String tst = "   Ola    Mundo       !   ";
		System.out.println("Original:\n"+tst);
		String tst1 = StrEspecial.trimGeral(tst);
		System.out.println("Com trim:\n"+tst1);		
		String tst2 = StrEspecial.trimToUp(tst1);
		System.out.println("+ toUpperCase:\n"+tst2);	
		String tst3 = StrEspecial.trimToLower(tst2);
		System.out.println("+ toLowerCase:\n"+tst3);	
	}
}
