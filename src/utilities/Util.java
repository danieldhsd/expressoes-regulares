package utilities;

import java.util.regex.Matcher;

public class Util {
	
	public static void imprimeResultado(Matcher matcher) {
		while (matcher.find()) {
			System.out.printf("Valor: %s%n", matcher.group());
		}
		
		System.out.println("-------------------");
	}
}
