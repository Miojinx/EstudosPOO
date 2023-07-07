package excessoes;

public class ExcessoesSlide {
	    public static void main(String[] args) {
	        int dividend = 10;
	        int divisor = 0;

	        try {
	            int result = dividend / divisor;
	            System.out.println("Resultado: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Erro: Divisão por zero!");
	        }
	    }
}

/*– Error: erro genérico (não devemos tratar)
– Exception: exceção genérica (devemos tratar suas subclasses)
– RuntimeException: exceção detectada em tempo de execução – não é
indicada pela IDE durante a compilação
– IOException: erros de entrada e saída
– ArithmeticException: erro de cálculo algébrico (ex.: divisão por zero)
– NullPointerException: erro de acesso a variável nula
– SQLException: erro de acesso a banco de dados*/