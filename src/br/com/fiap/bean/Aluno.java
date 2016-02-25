package br.com.fiap.bean;

import br.com.fiap.notation.Tabela;

@Tabela(nome="TAB_ALUNO")
public class Aluno {
	private String nome;
	private float peso;
	private int idade;
	
	public Aluno(String nome, float peso, int idade){
		this.nome = nome;
		this.peso = peso;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
