package Threads;

public class Teste2 {
 public static void main(String[] args) {
	 MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
	 MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 100);
	 MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 1000);
 }
}
//qual abordagem é melhor? gosto pessoal e o que o projeto necessita;