package quantificadores;

import utilities.Util;

import java.util.regex.Pattern;

public class DesafioEmail {
	
	public static void main(String[] args) {
		String texto = "Os e-mails dos convidados são: " +
				"- fulano@gmail.com " +
				"- xico@email.com " +
				"- maria_silva@email.com " +
				"- rafa.sampaio@email.com " +
				"- joao@empresa.info.br";
		
		Util.imprimeResultado(Pattern.compile("[\\w.]+@\\w+\\.\\w{2,4}\\.?\\w{0,2}").matcher(texto));
	}
}
