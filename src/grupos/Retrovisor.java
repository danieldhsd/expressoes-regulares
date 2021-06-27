package grupos;

import utilities.Util;

import java.util.regex.Pattern;

public class Retrovisor {
	
	public static void main(String[] args) {
		
		String texto = "<b>Destaque</b><strong>Forte</strong><div>Conteudo</div>";
		Util.imprimeResultado(Pattern.compile("<(\\w+)>.*</\\1>").matcher(texto));
		
		String texto2 = "Lentamente é mente muito lenta.";
		Util.imprimeResultado(Pattern.compile("(lenta)(mente).*\\2.*\\1\\.", Pattern.CASE_INSENSITIVE).matcher(texto2));
		
		// ?: nao guarda o grupo
		Util.imprimeResultado(Pattern.compile("(?:lenta)(mente).*\\1", Pattern.CASE_INSENSITIVE).matcher(texto2));
	
		Util.imprimeResultado(Pattern.compile("(lenta)(mente)", Pattern.CASE_INSENSITIVE).matcher(texto2));
		Util.imprimeResultado(Pattern.compile("(lenta)(mente)?", Pattern.CASE_INSENSITIVE).matcher(texto2));
		
		System.out.println(texto2.replaceAll("(Lenta)(mente)", "$2"));
	}
}
