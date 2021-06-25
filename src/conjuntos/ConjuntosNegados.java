package conjuntos;

import utilities.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConjuntosNegados {
	
	public static void main(String[] args) {
		String texto = "1,2,3,a.b c!d?e[f";
		
		Matcher matcher = Pattern.compile("\\D").matcher(texto);
		Util.imprimeResultado(matcher);
		matcher = Pattern.compile("[^0-9]").matcher(texto);
		Util.imprimeResultado(matcher);
		matcher = Pattern.compile("[^\\d!\\?\\[\\s,\\.]").matcher(texto);
		Util.imprimeResultado(matcher);
		
		texto = "1: !\"#$%&'()*+,-./ 2: :;<=>?@";
		matcher = Pattern.compile("[^!-/:-@\\s]").matcher(texto);
		Util.imprimeResultado(matcher);
	}
}
