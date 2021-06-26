package quantificadores;

import utilities.Util;

import java.util.regex.Pattern;

public class DesafioTelefone {
	
	public static void main(String[] args) {
		String texto = "Lista telefonica: " +
				"- (11) 98822-7156 " +
				"-99954-1180 " +
				"- (85) 98888-6542 " +
				"- (31) 8888-2135";
		
		Util.imprimeResultado(Pattern.compile("\\(?\\d{0,2}\\)?\\s?\\d{4,5}-\\d{4}").matcher(texto));
	}
}
