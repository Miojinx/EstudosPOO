package ListaExcecao;

import java.util.Scanner;

public class Questao2 {//na verdade é a 1

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		try {
			System.out.println("Insira um numero");
			String input = teclado.nextLine();
			int num = Integer.parseInt(input);

			if(num<0)
				throw new IllegalArgumentException("Número negativo");
		}catch(NumberFormatException e) {
			System.out.println("Erro: Formato do numero esta errado");
		}catch(IllegalArgumentException e) {
			System.out.println("Erro:"+ e.getMessage());
		}
	}

}
