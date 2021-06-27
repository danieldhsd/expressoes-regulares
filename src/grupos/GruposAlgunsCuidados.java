package grupos;

import utilities.Util;

import java.util.regex.Pattern;

public class GruposAlgunsCuidados {
	
	public static void main(String[] args) {
		String texto = "Pedrinho (filho de Pedro Silva) é doutor do ABC!";
		
		Util.imprimeResultado(Pattern.compile("[(abc)]", Pattern.CASE_INSENSITIVE).matcher(texto)); //Nao é um grupo dentro de conjunto
		Util.imprimeResultado(Pattern.compile("([abc])", Pattern.CASE_INSENSITIVE).matcher(texto)); //É conjunto dentro do grupo
		Util.imprimeResultado(Pattern.compile("(abc)", Pattern.CASE_INSENSITIVE).matcher(texto));
	}
}
