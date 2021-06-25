package caracteres;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ponto {
	// . é um coringa, valido para uma posicao
	public static void main(String[] args) {
		String texto = "1,2,3,4,5,6,7,8,9,0";
		
		Matcher matcher = Pattern.compile("1.2").matcher(texto);
		imprimeResultado(matcher);
		
		matcher = Pattern.compile("1..2").matcher(texto);
		imprimeResultado(matcher);
		
		matcher = Pattern.compile("1..,").matcher(texto);
		imprimeResultado(matcher);
		
		String notas = "8.3,7.1,8.8,10.0";
		
		matcher = Pattern.compile("8..").matcher(notas);
		imprimeResultado(matcher);
		
		matcher = Pattern.compile(".\\..").matcher(notas);
		imprimeResultado(matcher);
	}
	
	private static void imprimeResultado(Matcher matcher) {
		while (matcher.find()) {
			System.out.printf("Posicoes: %s, %s\tValor: %s%n",
					matcher.start(), matcher.end(), matcher.group());
		}
	}
}
