package entities;
	abstract class Animal{
		public abstract void fala();
	}
	
	class Homem extends Animal{
		@Override
		public void fala() {
			System.out.println("Oi");
		}
	}
	
	class Cao extends Animal{
		@Override
		public void fala() {
			System.out.println("AuAu");
		}
	}
	
	class Gato extends Animal{
		@Override
		public void fala() {
			System.out.println("Miau");
		}
	}
public class SlideHerança {
	
	
	public static void main(String[] args) {
		Homem h1 = new Homem();
		h1.fala();
	}
}
