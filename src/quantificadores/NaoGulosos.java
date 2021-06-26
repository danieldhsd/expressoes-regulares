package quantificadores;

import utilities.Util;

import java.util.regex.Pattern;

public class NaoGulosos {
	
	public static void main(String[] args) {
		String texto = "<div>Conteudo 01</div><div>Conteudo 02</div>";
		
		// quantificadores sao gulosos (greedy)
		Util.imprimeResultado(Pattern.compile("<div>.+</div>").matcher(texto));
		Util.imprimeResultado(Pattern.compile("<div>.*</div>").matcher(texto));
		Util.imprimeResultado(Pattern.compile("<div>.{0,100}</div>").matcher(texto));

		// quantificadores nao gulosos (lazy)
		Util.imprimeResultado(Pattern.compile("<div>.+?</div>").matcher(texto));
		Util.imprimeResultado(Pattern.compile("<div>.*?</div>").matcher(texto));
		Util.imprimeResultado(Pattern.compile("<div>.{0,100}?</div>").matcher(texto));
	}
}
