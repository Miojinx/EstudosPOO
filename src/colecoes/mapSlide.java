package colecoes;
import java.util.*;

public class mapSlide {
	public static void main(String[] args) {
		Map<String,String> dddPorMunicipio = new HashMap<>();
		dddPorMunicipio.put("São Paulo", "11");
		dddPorMunicipio.put("Rio de Janeiro", "21");
		dddPorMunicipio.put("Belo Horizonte", "31");
		for (String municipio : dddPorMunicipio.keySet()) {
		System.out.println("O DDD de " + municipio + " é " +
		dddPorMunicipio.get(municipio));
		}

	}
}

/*Principais métodos:
– put(chave, valor): adiciona uma chave indexando um valor no
dicionário
– get(chave): retorna o valor indexado pela chave
– getOrDefault(chave, valor): retorna o valor indexado pela chave ou o
valor default informado
– keySet(): retorna um conjunto com todas as chaves do dicionário
– remove(chave): remove o valor indexado pela chave no dicionário
– clear(): remove todas as entradas do dicionário
– isEmpty(): informa se o dicionário está vazio
– size(): informa o número de entradas do dicionário
*/