package ListaColecoes;

import java.util.*;

class KaraokeMachine{
	private List<String> avaliableSongs;
	private List<String> queue;
	public KaraokeMachine() {
		super();
		this.avaliableSongs = new ArrayList<>();
		this.queue = new ArrayList<>();
	}
	
	public void addSong(String song) {
		avaliableSongs.add(song);
	}
	public void removeSong(String song) {
		avaliableSongs.add(song);
	}
	public void addToQueue(String Song) {
		queue.add(Song);
	}
	public void playNextSong() {
		if(!queue.isEmpty()) {
			String song = queue.remove(0);
			System.out.println("Música atual: "+ song);
		}else {
			System.out.println("Fila Vazia");
		}
	}
	

}

public class Questao3 {
	
	HashSet<String> maqKaraoke = new HashSet<>();
	
	
}
