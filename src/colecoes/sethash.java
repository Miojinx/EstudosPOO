package colecoes;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class sethash {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        Set<String> palavras = new HashSet<>();
        String[] palavrasArray = frase.split(" ");

        for (String palavra : palavrasArray) {
            palavras.add(palavra);
        }

        int numeroPalavrasNaoRepetidas = palavras.size();
        System.out.println("Número de palavras não repetidas: " + numeroPalavrasNaoRepetidas);

        scanner.close();
    }
}