package caracteres;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OlaRegex {
	
	public static void main(String[] args) {
		String texto = "Casa bonita é a casa amarela da esquina com a Rua ACASALAR.";
		
		Matcher matcher = Pattern.compile("casa", Pattern.CASE_INSENSITIVE).matcher(texto);
		
		while (matcher.find()) {
			System.out.printf("Posicoes: %s, %s\tValor: %s%n",
					matcher.start(), matcher.end(), matcher.group());
		}
	}
}
