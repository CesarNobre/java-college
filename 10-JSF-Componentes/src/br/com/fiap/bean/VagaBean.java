package br.com.fiap.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import br.com.fiap.to.VagaTO;

@ManagedBean
public class VagaBean {
	private List<String> niveis;
	private List<String> linguagens;
	private VagaTO vaga;
	
	public List<String> getLinguagens() {
		return linguagens;
	}
	public void setLinguagens(List<String> linguagens) {
		this.linguagens = linguagens;
	}
	
	@PostConstruct
	private void init(){
		this.niveis = new ArrayList<String>();
		this.niveis.add("Júnior");
		this.niveis.add("Pleno");
		this.niveis.add("Senior");
		this.linguagens = new ArrayList<String>();
		this.linguagens.add("C#");
		this.linguagens.add("PHP");
		this.linguagens.add("JAVA");
	}
	public List<String> getNiveis() {
		return niveis;
	}
	
	public void cadastrar(){
		
		
	}
}
