package ListaColecoes;
import java.util.*;

public class Questao2 {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("Erik");
		lista.add("Bruno");
		lista.add("Yang");
		lista.add("Kadu");
		System.out.println("Lista: "+ lista);
		
		HashSet<String> hash = new HashSet<>(lista);
		System.out.println("Hashset:" + hash);
		
		PriorityQueue<String> prioridade = new PriorityQueue<>(hash);
		System.out.println("PriorityQueue:" +prioridade);
		
		ArrayDeque<String> deque = new ArrayDeque<>(prioridade);
		System.out.println("ArrayDeque:"+deque);
		
		TreeSet<String> arvore = new TreeSet<>(deque);
		System.out.println("TreeSet:"+arvore);
	}
	
}
