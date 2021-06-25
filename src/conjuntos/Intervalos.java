package conjuntos;

import utilities.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Intervalos {
	
	public static void main(String[] args) {
		String texto = "1,2,3,4,5,6,a.b c!d?e[f";
		
		Matcher matcher = Pattern.compile("[a-z]").matcher(texto);
		Util.imprimeResultado(matcher);
		
		matcher = Pattern.compile("[b-d]").matcher(texto);
		Util.imprimeResultado(matcher);
		
		matcher = Pattern.compile("[2-4]").matcher(texto);
		Util.imprimeResultado(matcher);
		
		matcher = Pattern.compile("[A-Z1-3]", Pattern.CASE_INSENSITIVE).matcher(texto);
		Util.imprimeResultado(matcher);
	}
}
