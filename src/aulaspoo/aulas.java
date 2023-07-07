package aulaspoo;

public class aulas{

public interface Animal{
	
	String habitat = "Planeta Terra";
	
	
	void dormir();
			
}

public interface Ave extends Animal{
	void voar();
}

public class Pombo implements Ave{
	public void dormir() {
		
	}
	
	public void voar() {
		
	}
}

}

