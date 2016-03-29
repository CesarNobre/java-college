package br.com.fiap.to;

import java.util.List;

public class VagaTO {
	private String nome;
	private String nivel;
	private boolean necessidadesEspeciais;
	private List<String> linguagens;
	private String descricao;
	private String viagens;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public boolean isNecessidadesEspeciais() {
		return necessidadesEspeciais;
	}
	public void setNecessidadesEspeciais(boolean necessidadesEspeciais) {
		this.necessidadesEspeciais = necessidadesEspeciais;
	}
	public List<String> getLinguagens() {
		return linguagens;
	}
	public void setLinguagens(List<String> linguagens) {
		this.linguagens = linguagens;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getViagens() {
		return viagens;
	}
	public void setViagens(String viagens) {
		this.viagens = viagens;
	}
	
	
}
