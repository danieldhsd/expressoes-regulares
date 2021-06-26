package quantificadores;

import utilities.Util;

import java.util.regex.Pattern;

public class UsandoChaves {
	
	public static void main(String[] args) {
		String texto = "O João recebeu 120 milhões apostando 6 9 21 23 45 46";
		
		// para definir quantificadoes usa {}
		Util.imprimeResultado(Pattern.compile("\\d{1,2}").matcher(texto)); // um ou dois digitos em sequencia
		Util.imprimeResultado(Pattern.compile("[0-9]{2}").matcher(texto)); // dois digitos em sequencia
		Util.imprimeResultado(Pattern.compile("\\d{1,}").matcher(texto)); // um ou mais digitos em sequencia
		
		Util.imprimeResultado(Pattern.compile("\\w{7}").matcher(texto)); // 7 palavras unicode em sequencia
		Util.imprimeResultado(Pattern.compile("[\\wõã]{7,}").matcher(texto)); // 7 ou mais palavras unicode em sequencia incluindo õ e ã
		
		Util.imprimeResultado(Pattern.compile("\\b\\d{1,2}\\b").matcher(texto)); // de um a dois numeros em sequencia separados por bordas
		Util.imprimeResultado(Pattern.compile("\\b[\\wõ]{7}\\b").matcher(texto)); // sete caracteres unicode em sequencia separados por bordas
	}
}
