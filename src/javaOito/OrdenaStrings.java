package javaOito;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		populaListaPalavras(palavras);
		System.out.println(palavras);
		
		palavras.sort((s1, s2) -> {
		    return Integer.compare(s1.length(), s2.length());
		});

		palavras.forEach((String s) -> System.out.println(s));
		
	}

	@SuppressWarnings("unused")
	private static void ordemaPalavrasAnteriorJavaOito(List<String> palavras, Comparator<String> comparador) {
		Collections.sort(palavras);
		System.out.println(palavras);
		Collections.sort(palavras, comparador);
	}

	private static void populaListaPalavras(List<String> palavras) {
		palavras.add("palavra 01");
		palavras.add("palavra 02");
		palavras.add("Balavra 03");
		palavras.add("palavra 05");
		palavras.add("palavra04");
	}
}
