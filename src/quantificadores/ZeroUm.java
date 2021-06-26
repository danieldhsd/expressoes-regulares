package quantificadores;

import utilities.Util;

import java.util.regex.Pattern;

public class ZeroUm {
	
	public static void main(String[] args) {
		String texto = "De longe eu avistei o fogo e uma pessoa gritando: FOGOOOO!";
		String texto1 = "There is a big fog in NYC";
		
		Util.imprimeResultado(Pattern.compile("fogo?", Pattern.CASE_INSENSITIVE).matcher(texto));
		Util.imprimeResultado(Pattern.compile("fogo?", Pattern.CASE_INSENSITIVE).matcher(texto1));
	}
}
