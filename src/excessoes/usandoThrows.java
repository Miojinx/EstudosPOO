package excessoes;
import java.util.*;
public class usandoThrows {
	public static void main(String[] args) {
		
		System.out.println("entre com um num decimal");
		try {
		double num = lerNumero();
		System.out.println("você digitou"+ num);
		}catch(Exception e) {
			System.out.println("Entrada invalida");
			e.printStackTrace();
		}
	}
	
	public double lerNumero() throws Exception{
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		return num;
	}
}
