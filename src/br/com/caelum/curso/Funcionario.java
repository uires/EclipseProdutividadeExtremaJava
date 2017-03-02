package br.com.caelum.curso;

import java.util.Calendar;

public class Funcionario {
	private String nome;
	private	int idade;
	private Calendar dataNascimento;
	private double bonificacao;
	public Funcionario(String nome, int idade, Calendar dataNascimento) {
		this.nome = nome;
		this.idade = idade;
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(bonificacao);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Funcionario other = (Funcionario) obj;
		if (Double.doubleToLongBits(bonificacao) != Double
				.doubleToLongBits(other.bonificacao))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public int getIdade() {
		return idade;
	}
	public String getNome() {
		return nome;
	}
	@Override
	public String toString() {
		return "\n[Nome: " + this.nome + "\nIdade: " + this.idade +
				" ]";
	}
	
	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}
	public void sacaBonus(double saca){
		if(this.bonificacao < saca){			
			throw new NullPointerException("Valor excedeu!");
		}else{
			this.bonificacao -=saca;
			System.out.println("Você sacou R$" + saca + "\nBonificação atual R$" +
					this.bonificacao);
		}		
	}
	
	
}
