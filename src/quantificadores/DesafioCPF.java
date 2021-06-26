package quantificadores;

import utilities.Util;

import java.util.regex.Pattern;

public class DesafioCPF {
	
	public static void main(String[] args) {
		String texto = "CPF dos aprovados: " +
				"- 117.790.166-89 " +
				"- 108.135.189-78";
		
		Util.imprimeResultado(Pattern.compile("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}").matcher(texto));
	}
}
