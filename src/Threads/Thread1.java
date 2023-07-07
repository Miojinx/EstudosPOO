package Threads;

//processo é um programa que está sendo executado
//Thread é a menor unidade de codigo que pode ser executada
//vantagem da thread: maior eficiencia dos programas
//start inicia o metodo run e o run executa a tarefa. Sleep coloca thread pra dormir por x segundos
public class Thread1 extends Thread {

	private String nome;
	private int tempo;

	public Thread1(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		start();
	}

	@Override
	public void run() {
		try {
		for (int i = 0; i < 6; i++) {
			System.out.println(nome + "contador: " + i);
			Thread.sleep(tempo);
		}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(nome + "terminou a execução");
	}
		

}
