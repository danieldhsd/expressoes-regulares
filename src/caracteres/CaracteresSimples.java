package caracteres;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaracteresSimples {
	
	public static void main(String[] args) {
		String texto = "1,2,3,4,5,6,a.b c!d?e";
		
		Matcher matcher = Pattern.compile(",").matcher(texto);
		while (matcher.find()) {
			System.out.printf("Posicoes: %s, %s\tValor: %s%n",
					matcher.start(), matcher.end(), matcher.group());
		}
		
		matcher = Pattern.compile("A", Pattern.CASE_INSENSITIVE).matcher(texto);
		while (matcher.find()) {
			System.out.printf("Posicoes: %s, %s\tValor: %s%n",
					matcher.start(), matcher.end(), matcher.group());
		}
	}
}
