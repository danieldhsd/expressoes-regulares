package conjuntos;

import utilities.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Conjuntos {
	
	public static void main(String[] args) {
		String texto = "1,2,3,4,5,6,a.b c!d?e[f";
		
		Matcher matcher = Pattern.compile("[02468]").matcher(texto);
		Util.imprimeResultado(matcher);
		
		texto = "João não vai passear na moto.";
		matcher = Pattern.compile("n[aã]").matcher(texto);
		Util.imprimeResultado(matcher);
	}
}
