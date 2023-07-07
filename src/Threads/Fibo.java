package Threads;

import java.util.Scanner;

class TarefaFibonacci implements Runnable{
	int n;
	int result;
	public TarefaFibonacci(int n) {
		this.n = n;
	}
	public int fibonacci(int n) {
		if(n==0 || n==1) {
			return n;}
		else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	@Override
	public void run() {
		result = fibonacci(n);
	}
}

public class Fibo {
	public static void main(String[] args) {
		System.out.println("Digite um número");
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		TarefaFibonacci f1 = new TarefaFibonacci(n-1);
		TarefaFibonacci f2 = new TarefaFibonacci(n-2);
		Thread t1 = new Thread(f1);
		Thread t2 = new Thread(f2);
		t1.start();
		t2.start();
		
		try {
			t1.join();
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}try {
			t2.join();
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Resultado=" + (f1.result + f2.result));
	}
}
