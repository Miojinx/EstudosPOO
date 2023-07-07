package colecoes;
import java.util.*;
public class colecoesSlide {
	
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite uma frase: ");
	        String frase = scanner.nextLine();

	        List<String> palavras = new ArrayList<>();
	        String[] palavrasArray = frase.split(" ");

	        for (String palavra : palavrasArray) {
	            palavras.add(palavra);
	        }

	        System.out.println("Frase invertida:");
	        for (int i = palavras.size() - 1; i >= 0; i--) {
	            System.out.print(palavras.get(i) + " ");
	        }

	        scanner.close();
	    }
}
