package utilities;

import java.util.regex.Matcher;

public class Util {
	
	public static void imprimeResultado(Matcher matcher) {
		while (matcher.find()) {
			System.out.printf("Posicoes: %s, %s\tValor: %s%n",
					matcher.start(), matcher.end(), matcher.group());
		}
		
		System.out.println("-------------------");
	}
}
