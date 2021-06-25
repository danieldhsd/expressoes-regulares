package conjuntos;

import utilities.Util;

import java.util.regex.Pattern;

public class ConjuntoUnicode {
	
	public static void main(String[] args) {
		String texto = "áéíóú àèìòù âêîôû ç ãõ ü";
		
		Util.imprimeResultado(Pattern.compile("[À-ü]").matcher(texto));
	}
}
