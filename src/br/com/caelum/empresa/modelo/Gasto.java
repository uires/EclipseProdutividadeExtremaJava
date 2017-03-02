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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result
				+ ((funcionario == null) ? 0 : funcionario.hashCode());
		result = prime * result + (pagoEmDinheiro ? 1231 : 1237);
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		long temp;
		temp = Double.doubleToLongBits(valor);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gasto other = (Gasto) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (funcionario == null) {
			if (other.funcionario != null)
				return false;
		} else if (!funcionario.equals(other.funcionario))
			return false;
		if (pagoEmDinheiro != other.pagoEmDinheiro)
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		if (Double.doubleToLongBits(valor) != Double
				.doubleToLongBits(other.valor))
			return false;
		return true;
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
