package ListaExcecao;

class Financiamento{
	public double valorTotal;
	public double entrada;
	public int parcelas;
	public Financiamento(double valorTotal, double entrada, int parcelas) {
		this.valorTotal = valorTotal;
		this.entrada = entrada;
		this.parcelas = parcelas;
	}
	public double prestacao() {
		return (valorTotal-entrada)/parcelas;
	}
}
public class estudo {
	
	public static void main(String[] args) {
		double valorTotal = 1000.0;
		double entrada = 100.0;
		int parcelas = 10;
		
		if(entrada < valorTotal * 0.2) {
			System.out.println("");
		}
		
		Financiamento f = new Financiamento(valorTotal, entrada, parcelas);
		System.out.println(f.prestacao());
	}
}
