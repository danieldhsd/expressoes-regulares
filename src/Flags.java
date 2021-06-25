import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Flags {
	
	public static void main(String[] args) {
		String texto = "Carlos assinou o abaixo-assinado.";
		String pattern = "C|ab";
		
		Matcher matcher = Pattern.compile(pattern).matcher(texto);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
