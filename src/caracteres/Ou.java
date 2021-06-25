package caracteres;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ou {
	public static void main(String[] args) {
		String texto = "Voce precisa responder sim, nao, nao sei!";

		Matcher matcher = Pattern.compile("sim|nao|sei").matcher(texto);
		imprimeResultado(matcher);
	}
	
	private static void imprimeResultado(Matcher matcher) {
		while (matcher.find()) {
			System.out.printf("Posicoes: %s, %s\tValor: %s%n",
					matcher.start(), matcher.end(), matcher.group());
		}
	}
}
