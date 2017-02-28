package br.com.caelum.curso;

import java.util.Calendar;

public class Funcionario {
	private String nome;
	private	int idade;
	private Calendar dataNascimento;
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
		return "[Nome: " + this.nome + "\nIdade: " + this.idade +
				"\nData Nascimento: " + dataNascimento + " ]";
	}
	
	
}
