package br.com.caelum.curso;

import java.util.Calendar;
import java.util.GregorianCalendar;
public class Principal {
	public static void main(String[] args) {
		Calendar dataNascimento = new GregorianCalendar(1997, 11, 26);		
		Funcionario funcionario = new Funcionario("João", 22, dataNascimento);
		System.out.println(funcionario);
	
		
	}
}
