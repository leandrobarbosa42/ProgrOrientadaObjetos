package exercicio2;

public class Produto {
	private int codigo;
	private String nome;
	private int qtdEstoque;
	
	public void setCodigo(int a){
		this.codigo = a;
	}
	public int getCodigo(){
		return codigo;
	}
	
	public void setNome(String b){
		this.nome = b;
	}
	public String getNome(){
		return nome;
	}
	
	public void setQtdEstoque(int c){
		this.qtdEstoque = c;
	}
	public int getQtdEstoque(){
		return qtdEstoque;
	}
	
	
	public Produto(int x, String y, int z){
		codigo = x;
		nome = y;
		qtdEstoque = z;
	}
	
	public void mostrarDados() {
		String texto = "Codigo do produto: %06d \nNome produto: %s \nQntd estoque: %02d";
		String txt = String.format(texto, codigo, nome, qtdEstoque);
		System.out.println("-----------------------------");
		System.out.println(txt);
	}
}
