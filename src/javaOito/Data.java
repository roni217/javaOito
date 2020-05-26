package javaOito;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Data {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);

		LocalDate natal = LocalDate.of(2020, Month.DECEMBER, 25);
		int anos = natal.getYear() - hoje.getYear();
		System.out.println(anos+"\n\n");

		Period periodo = Period.between(hoje, natal);
		System.out.println(periodo+"\n");
		System.out.println(periodo.getYears());
		System.out.println(periodo.getMonths());
		System.out.println(periodo.getDays());
		
		LocalDate proximoNatal = natal.plusYears(1);
		System.out.println("proximo natal: "+proximoNatal);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		
		String valorFormatado = proximoNatal.format(formatador);
		System.out.println(valorFormatado);
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorComHoras));
		
		YearMonth mes = YearMonth.now();
		System.out.println("MES: " + mes.format(DateTimeFormatter.ofPattern("MM/yyyy")));
		
		LocalTime intervalo = LocalTime.of(15, 30);
		System.out.println("intervalo: "+ intervalo);
		
	}

}
