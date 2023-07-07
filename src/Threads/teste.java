package Threads;

public class teste {

	public static void main(String[] args) {
		Thread1 thread = new Thread1("thread 1", 600);
		Thread1 thread2 = new Thread1("thread 2",900);
		//thread.start(); chama o metodo run, foi criado no construtor pra ja ser executado ao ser criado
		
	}
	
}
