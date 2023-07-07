package excessoes;

public class AulaLoiane {

	public static void main(String[] args) {
		try {
			int[] vetor = new int[4];
			System.out.println("Antes da Exceção");
			vetor[4] = 1;
			System.out.println("Esse texto não será impresso");
		} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Erro ao tentar adicionar indice fora do vetor");
		}
		System.out.println("Esse texto será impresso após o exception");
 		
	}

}
