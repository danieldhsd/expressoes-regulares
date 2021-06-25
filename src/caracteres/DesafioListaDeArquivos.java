package caracteres;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DesafioListaDeArquivos {
	
	public static void main(String[] args) {
		String texto = "lista de arquivos mp3: jazz.mp3,rock.mp3,podcast.mp3,blues.mp3";
		
		Matcher matcher = Pattern.compile("\\.mp3").matcher(texto);
		imprimeResultado(matcher);
	}
	
	private static void imprimeResultado(Matcher matcher) {
		while (matcher.find()) {
			System.out.printf("Posicoes: %s, %s\tValor: %s%n",
					matcher.start(), matcher.end(), matcher.group());
		}
	}
}
