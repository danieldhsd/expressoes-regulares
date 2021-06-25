package caracteres;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Unicode {
	
	public static void main(String[] args) {
		String texto = "aʬcd";
		
		Matcher matcher = Pattern.compile("\\u02AC|\\u0BF5").matcher(texto);
		imprimeResultado(matcher);
	}
	
	private static void imprimeResultado(Matcher matcher) {
		while (matcher.find()) {
			System.out.printf("Posicoes: %s, %s\tValor: %s%n",
					matcher.start(), matcher.end(), matcher.group());
		}
	}
}
