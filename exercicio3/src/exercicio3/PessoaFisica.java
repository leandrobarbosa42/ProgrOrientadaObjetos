package exercicio3;

import javax.swing.JOptionPane;

public final class PessoaFisica extends Pessoa{
	private String cpf;
	private int idade;
	
	public PessoaFisica(){
	
	}
	
	public void cadastrarPessoa(){
		String n = JOptionPane.showInputDialog(null, "Digite seu nome: ", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
		this.setNome(n);
		String e = JOptionPane.showInputDialog(null, "Digite seu endereço: ", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
		this.setEndereco(e);
		String c = JOptionPane.showInputDialog(null, "Digite seu CPF: ", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
		setCpf(c);
		String i = JOptionPane.showInputDialog(null, "Digite sua idade: ", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
		int ix = Integer.parseInt(i);
		setIdade(ix);
	}
	public void mostrarDados() {
		String txt = "Nome: %s \nEndereco: %s \nCPF: %s \nIdade: %s ";
		String texto = String.format(txt, getNome(), getEndereco(), cpf, idade);
		System.out.println(texto);
	}
	
	
	
	
 	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

}
