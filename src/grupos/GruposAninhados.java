package grupos;

import utilities.Util;

import java.util.regex.Pattern;

public class GruposAninhados {
	
	public static void main(String[] args) {
		String texto = "supermercado hipermercado minimercado mercado";
		
		Util.imprimeResultado(Pattern.compile("(super|hiper|mini)?mercado").matcher(texto));
		Util.imprimeResultado(Pattern.compile("((hi|su)per|mini)?mercado").matcher(texto));
	}
}
