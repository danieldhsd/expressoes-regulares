package grupos;

import utilities.Util;

import java.util.regex.Pattern;

public class GruposEspeciais {
	
	public static void main(String[] args) {
		String texto = "João é calmo, mas no transito fica nervoso.";
		
		Util.imprimeResultado(Pattern.compile("[\\wÀ-ú]+", Pattern.CASE_INSENSITIVE).matcher(texto));
		
		//Positive lookahead
		Util.imprimeResultado(Pattern.compile("[\\wÀ-ú]+(?=,)", Pattern.CASE_INSENSITIVE).matcher(texto));
		Util.imprimeResultado(Pattern.compile("[\\wÀ-ú]+(?=\\.)", Pattern.CASE_INSENSITIVE).matcher(texto));
		Util.imprimeResultado(Pattern.compile("[\\wÀ-ú]+(?=, mas)", Pattern.CASE_INSENSITIVE).matcher(texto));
		
		//Negative lookahead
		Util.imprimeResultado(Pattern.compile("[\\wÀ-ú]+\\b(?!,)", Pattern.CASE_INSENSITIVE).matcher(texto));
		Util.imprimeResultado(Pattern.compile("[\\wÀ-ú]+[\\s|.](?!,)", Pattern.CASE_INSENSITIVE).matcher(texto));
	}
}
