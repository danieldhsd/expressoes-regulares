package grupos;

import utilities.Util;

import java.util.regex.Pattern;

public class GruposEspeciais2 {
	
	public static void main(String[] args) {
		String texto = "supermercado superação hiperMERCADO Mercado";
		
		Util.imprimeResultado(Pattern.compile("(?:super)[\\wÀ-ú]+", Pattern.CASE_INSENSITIVE).matcher(texto));

		//Positive lookbehind
		Util.imprimeResultado(Pattern.compile("(?<=super)[\\wÀ-ú]+", Pattern.CASE_INSENSITIVE).matcher(texto));

		//Negative lookbehind
		Util.imprimeResultado(Pattern.compile("(?<!super)mercado", Pattern.CASE_INSENSITIVE).matcher(texto));
	}
}
