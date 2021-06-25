package caracteres;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Brancos {
	
	public static void main(String[] args) {
		String texto = "\nca	r\nr	o s!\n";
		
		Matcher matcher = Pattern.compile("ca\tr\nr\to\\ss").matcher(texto);
		imprimeResultado(matcher);
	}
	
	private static void imprimeResultado(Matcher matcher) {
		while (matcher.find()) {
			System.out.printf("Posicoes: %s, %s\tValor: %s%n",
					matcher.start(), matcher.end(), matcher.group());
		}
	}
}
