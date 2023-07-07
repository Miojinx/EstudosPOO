package ListaExcecao;
class contaCorrente{
	private float limite;
	private float saldo;
	public float valorLimite;
	public contaCorrente(float valorLimite) {
		this.limite = 0.0f;
		this.saldo = 0.0f;
		this.valorLimite = valorLimite;
	}	
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public void sacar(float valor) {
		if(valor < 0) {
			throw new IllegalArgumentException("O valor do saque deve ser positivo");
		}
		if(valor > limite + saldo) {
			throw new IllegalArgumentException("Saldo insuficiente para saque");
		}
		saldo-= valor;
	}
	
	public void depositar(float valor) {
		if(valor < 0) {
			throw new IllegalArgumentException("Impossível depositar valor negativo");
		}
		saldo+=valor;
	}
	
	public void setValorLimite(float valor) {
		if(valor<0)
		{throw new IllegalArgumentException("nnão é possivel limite negativo");
		}
		if(valor<saldo) {
			throw new IllegalArgumentException("Limite menor que o saldo atual");
		}
		
		limite = valor - saldo;
		valorLimite = valor;
	}
	
}
public class questao1 {
public static void main(String[] args) {
	contaCorrente conta = new contaCorrente(1000.f);
	try {
		conta.depositar(500.0f);
		System.out.println("Saldo"+ conta.getSaldo());
		conta.depositar(200.0f);
		System.out.println("Saldo"+ conta.getSaldo());
		conta.depositar(1500.0f);
		System.out.println("Saldo"+ conta.getSaldo());
	}catch(IllegalArgumentException e){
		System.out.println("Erro: "+ e.getMessage());
	}
	
}
}
