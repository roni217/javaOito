package javaOito;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		populaListaPalavras(palavras);
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		
		palavras.sort(comparador); 
		System.out.println(palavras);

		palavras.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);	
			}
		});
		
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

class ComparadorPorTamanho implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		if(o1.length() < o2.length())
			return -1;
		if(o1.length() > o2.length())
			return 1;
		return 0;
	}
}

