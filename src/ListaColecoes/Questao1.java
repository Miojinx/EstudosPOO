package ListaColecoes;

import java.util.*;

public class Questao1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite uma frase");
		String frase = teclado.nextLine();
		String[] vetor = frase.split(" ");
		
		Map<String, Integer> map = new HashMap<>();
		
	    for(String p : vetor) {
	    	map.put(p, 0);
	    }
	    
	    for(int i = 0; i< vetor.length; i++) {
	    	if(map.containsKey(vetor[i])) {
	    		map.put(vetor[i], map.get(vetor[i])+1);
	    	}
	    }
	    
        teclado.close();
    }
}


