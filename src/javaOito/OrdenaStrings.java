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

		palavras.sort(Comparator.comparing(s -> s.length()));

		palavras.forEach((String s) -> System.out.println(s));
		System.out.println("\nOu\n");
		palavras.forEach(System.out::println);
		
	}

	@SuppressWarnings("unused")
	private static void ordemaPalavrasAnteriorJavaOito(List<String> palavras, Comparator<String> comparador) {
		Collections.sort(palavras);
		System.out.println(palavras);
		Collections.sort(palavras, comparador);
	}

	private static void populaListaPalavras(List<String> palavras) {
		palavras.add("palavra media");
		palavras.add("palavra bem maior");
		palavras.add("Balavra p");
	}
}
