package conjuntos;

import utilities.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IntervalosCuidados {
	
	public static void main(String[] args) {
		String texto = "ABC [abc] a-c 1234";
		
		Matcher matcher = Pattern.compile("[a-c]").matcher(texto);
		Util.imprimeResultado(matcher);
		
		matcher = Pattern.compile("a-c").matcher(texto); // nao define conjunto
		Util.imprimeResultado(matcher);
		
		matcher = Pattern.compile("[A-z]").matcher(texto); // intervalos usam ordem da tabela UNICODE
		Util.imprimeResultado(matcher);
		
		// tem que respeitar a ordem da tabela UNICODE
//		matcher = Pattern.compile("[a-Z]").matcher(texto);
//		matcher = Pattern.compile("[4-1]").matcher(texto);
	}
}
