package conjuntos;

import utilities.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConjuntosComMetacarcteres {
	
	public static void main(String[] args) {
		String texto = ".$+*?-";
		
		Matcher matcher = Pattern.compile("[+.?*$].").matcher(texto); // nao precisa de escape dentro do conjunto
		Util.imprimeResultado(matcher);
		matcher = Pattern.compile("[$-?]").matcher(texto); // isso é um intervalo valido
		Util.imprimeResultado(matcher);
		
		// Nao é um intervalo (range)
		matcher = Pattern.compile("[$\\-?]").matcher(texto);
		Util.imprimeResultado(matcher);
		matcher = Pattern.compile("[-?]").matcher(texto);
		Util.imprimeResultado(matcher);
		
		// podem precisar de escape dentro do conjunto: - [ ] ^
	}
}
