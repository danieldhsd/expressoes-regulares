package grupos;

import utilities.Util;

import java.util.regex.Pattern;

public class Grupos {
	
	public static void main(String[] args) {
		String texto = "O José Simão é muito engraçado... hehehehehe";
		Util.imprimeResultado(Pattern.compile("(he)+").matcher(texto));
		
		String texto2 = "http://site.info www.escola.ninja.br google.com.ag";
		Util.imprimeResultado(Pattern.compile("(http://)?(www\\.)?\\w+\\.\\w{2,}(\\.\\w{2})?").matcher(texto2));
	}
}
