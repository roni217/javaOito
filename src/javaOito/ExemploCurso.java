package javaOito;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

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

		System.out.println("\n\n");

		cursos.stream().filter(d -> d.getQtdAlunos() > 100).map(Curso::getQtdAlunos)
				.forEach(x -> System.out.println(x));

		int soma = cursos.stream().filter(c -> c.getQtdAlunos() > 100).mapToInt(Curso::getQtdAlunos).sum();

		System.out.println("Total de alunos: " + soma);

		Optional<Curso> optCurso = cursos.stream().filter(c -> c.getQtdAlunos() > 100).findAny();

		Curso curso = optCurso.orElse(null);
		System.out.println(curso.getNome());

		optCurso.ifPresent(c -> System.out.println(c.getNome()));

		// com map
		Map<String, Integer> mapa = cursos.stream().filter(c -> c.getQtdAlunos() > 100)
				.collect(Collectors.toMap(c -> c.getNome(), c -> c.getQtdAlunos()));
		System.out.println(mapa);

		// ou
		cursos.stream().filter(c -> c.getQtdAlunos() > 100)
				.collect(Collectors.toMap(c -> c.getNome(), c -> c.getQtdAlunos()))
				.forEach((nome, alunos) ->  System.out.println(nome + " tem " + alunos));

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
		String ret = "Nome: " + this.nome + "\nQuantidade De Alunos " + this.qtdAlunos;
		return ret;
	}

}