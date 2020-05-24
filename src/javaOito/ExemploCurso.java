package javaOito;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExemploCurso {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		cursos.sort(Comparator.comparing(Curso::getQtdAlunos));

		cursos.forEach(c -> System.out.println(c.getNome()));

		cursos.stream().filter(c -> c.getQtdAlunos() >= 100);
		System.out.println("\n\n");
		cursos.stream().filter(c -> c.getQtdAlunos() > 100).forEach(System.out::println);
		
		cursos.stream()
		   .filter(d -> d.getQtdAlunos() > 100)
		   .map(Curso::getQtdAlunos)
		   .forEach(x -> System.out.println(x));
		
		int soma = cursos.stream()
				   .filter(c -> c.getQtdAlunos() > 100)
				   .mapToInt(Curso::getQtdAlunos)
				   .sum();
		System.out.println("Total de alunos: " +soma);
	}
}

class Curso {
	private String nome;
	private int qtdAlunos;

	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.qtdAlunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getQtdAlunos() {
		return qtdAlunos;
	}
	
	@Override
	public String toString() {
		String ret ="Nome: "+this.nome+"\nQuantidade De Alunos "+this.qtdAlunos; 
		return ret;
	}

}