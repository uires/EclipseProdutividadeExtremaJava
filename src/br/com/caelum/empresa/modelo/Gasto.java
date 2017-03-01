package br.com.caelum.empresa.modelo;

import java.util.Calendar;

import br.com.caelum.curso.Funcionario;

public class Gasto {
	private double valor;
	private String tipo;
	private Funcionario funcionario;
	private Calendar data;
	private boolean pagoEmDinheiro;

	public void setPagoEmDinheiro(boolean pagoEmDinheiro) {
		this.pagoEmDinheiro = pagoEmDinheiro;
	}

	public Gasto(double valor, String tipo, Funcionario funcionario,
			Calendar data) {
		this.valor = valor;
		this.tipo = tipo;
		this.funcionario = funcionario;
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "Gasto valor R$" + valor + ", tipo: " + tipo +
				"\nFuncionário : " + this.funcionario;
	}

	public String getTipo() {
		return tipo;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public Calendar getData() {
		return data;
	}

}
