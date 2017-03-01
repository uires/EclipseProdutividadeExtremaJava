package br.com.caelum.empresa.modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.caelum.curso.Funcionario;

public class TesteGastos {
	public static void main(String[] args) {
		Calendar dataNascimento = new GregorianCalendar(1998, 2, 1);
		Funcionario funcionario = new Funcionario("Vinicius", 19, dataNascimento);
		Calendar hoje = Calendar.getInstance();
		Gasto gasto = new Gasto(40.5, "taxi", funcionario , hoje);
		Gasto gasto2 = new Gasto(10.1, "taxi", funcionario , hoje);
		Gasto gasto3 = new Gasto(22.35, "taxi", funcionario , hoje);
		Gasto gasto4 = new Gasto(39.5, "taxi", funcionario , hoje);
		
		
		
		System.out.println(gasto);
		System.out.println(gasto2);
		System.out.println(gasto3);
		System.out.println(gasto4);		
		
		funcionario.setBonificacao(3000.1);
		funcionario.sacaBonus(400);		
		
		
		
		
	}
}
