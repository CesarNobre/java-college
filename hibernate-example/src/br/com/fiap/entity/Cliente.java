package br.com.fiap.entity;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="T_CLIENTE")
@SequenceGenerator(name="seqCliente", sequenceName="SEQ_T_CLIENTE", allocationSize=1)
public class Cliente {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqCliente")
	private int codigo;
	
	@Column(name="NM_CLIENTE", nullable=false, length=150)
	private String nome;
	
	@Column(name="NM_EMAIL", nullable=false, length=50)
	private String email;
	
	@Column(name="DT_NASCIMENTO", nullable=true)
	@Temporal(value=TemporalType.DATE)
	private Date dataNascimento;
	
	
	@Transient
	private boolean logado;
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return codigo;
	}
	public void setId(int id) {
		this.codigo = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isLogado() {
		return logado;
	}
	public void setLogado(boolean logado) {
		this.logado = logado;
	}
	
}
