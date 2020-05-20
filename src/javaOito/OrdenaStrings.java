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
		
		//ordemaPalavrasAnteriorJavaOito(palavras, comparador);
				
		/*
		 * metodo default foi adicionado no jaba 8
		 *  
		 * */
		palavras.sort(comparador); 
		System.out.println(palavras);

		Consumer <String> consumidor = new ImprimeNaLinha();
		palavras.forEach(consumidor);
		
	}

	private static void ordemaPalavrasAnteriorJavaOito(List<String> palavras, Comparator<String> comparador) {
		Collections.sort(palavras); // Comparador por ordem alfabetica levando
		System.out.println(palavras);
		Collections.sort(palavras, comparador); // Comparador por ordem alfabetica levando
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
class ImprimeNaLinha implements Consumer<String>{

	@Override
	public void accept(String s) {
		System.out.println(s);
	}
	
}
