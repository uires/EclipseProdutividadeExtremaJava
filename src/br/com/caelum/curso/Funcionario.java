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
