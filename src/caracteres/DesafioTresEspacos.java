package caracteres;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DesafioTresEspacos {
	
	public static void main(String[] args) {
		String texto = "a   b";
		
		Matcher matcher = Pattern.compile("a\\s+b").matcher(texto);
		imprimeResultado(matcher);
		
		matcher = Pattern.compile("a\\s{3}b").matcher(texto);
		imprimeResultado(matcher);
	}
	
	private static void imprimeResultado(Matcher matcher) {
		while (matcher.find()) {
			System.out.printf("Posicoes: %s, %s\tValor: %s%n",
					matcher.start(), matcher.end(), matcher.group());
		}
	}
}
