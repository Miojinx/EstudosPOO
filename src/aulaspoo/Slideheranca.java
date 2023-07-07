package aulaspoo;

public class Slideheranca {
	
	public class Usuario{
		private String nome;
		private String senha;
		
		public Usuario(String nome, String senha) {
			this.nome = nome;
			this.senha = senha;
		}
		
	}
	
	public class Cliente extends Usuario{
		private String dados;

		public Cliente(String nome, String senha, String dados) {
			super(nome, senha);
			this.dados = dados;
		}
		
	}
	
	public class Funcionario extends Usuario{

		public Funcionario(String nome, String senha) {
			super(nome, senha);
		}
		public void venda() {
			System.out.println("vendido");
		}
	}
	
	public class Gerente extends Funcionario{

		public Gerente(String nome, String senha) {
			super(nome, senha);
			// TODO Auto-generated constructor stub
		}
		public void fecharCaixa() {
			System.out.println("fechado");
		}
	}
	
}
