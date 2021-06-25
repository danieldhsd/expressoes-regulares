package caracteres;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProblemaPonto {
	
	public static void main(String[] args) {
		String texto = "Bom\ndia";
		
		Matcher matcher = Pattern.compile(".\\s.").matcher(texto);
		imprimeResultado(matcher);
	}
	
	private static void imprimeResultado(Matcher matcher) {
		while (matcher.find()) {
			System.out.printf("Posicoes: %s, %s\tValor: %s%n",
					matcher.start(), matcher.end(), matcher.group());
		}
	}
}
