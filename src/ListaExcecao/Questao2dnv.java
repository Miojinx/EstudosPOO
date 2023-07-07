package ListaExcecao;

class ContaCorrente {
	private float limite;
	private float saldo;
	private float valorLimite;

	public ContaCorrente(float limite, float valorLimite) {
		this.limite = limite;
		this.saldo = 0;
		this.valorLimite = valorLimite;
	}

	public void sacar(float valor) throws IllegalArgumentException{
		if(valor<=0) {
			throw new IllegalArgumentException("Valor de saque nulo negativo");
		}
		if(valor>saldo+limite) {
			throw new IllegalArgumentException("Saldo insuficiente");
		}
		saldo-= valor;
		System.out.println("Novo Saldo: "+ saldo);
	}
	
	public void depositar (float valor) throws IllegalArgumentException{
		if(valor<=0)
			throw new IllegalArgumentException("Valor nulo ou negativo");
		saldo+=valor;
		System.out.println("Saldo atualizado para: "+ saldo);
	}
	
	public void setValorLimite(float valor) throws IllegalArgumentException{
		if(valor<=0)
			throw new IllegalArgumentException("Valor nulo ou negativo");
		this.valorLimite = valor;
		
	}



}

public class Questao2dnv {

}
