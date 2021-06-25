package conjuntos;

import utilities.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Shorthands {
	
	public static void main(String[] args) {
		String texto = "1,2,3,4,5,6,a.b c!d?e\r -\nf_g";
		
		Matcher matcher = Pattern.compile("\\d").matcher(texto); // numeros [0-9]
		Util.imprimeResultado(matcher);
		matcher = Pattern.compile("\\D").matcher(texto); // nao numeros [^0-9]
		Util.imprimeResultado(matcher);
		
		matcher = Pattern.compile("\\w").matcher(texto); // caracters [a-zA-Z0-9_]
		Util.imprimeResultado(matcher);
		matcher = Pattern.compile("\\W").matcher(texto); // nao caracteres [^a-zA-Z0-9_]
		Util.imprimeResultado(matcher);
		
		matcher = Pattern.compile("\\s").matcher(texto); // espaco [ \t\n\r\f]
		Util.imprimeResultado(matcher);
		matcher = Pattern.compile("\\S").matcher(texto); // nao espaco [^ \t\n\r\f]
		Util.imprimeResultado(matcher);
	}
}
