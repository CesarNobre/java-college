package br.com.fiap.entity;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="T_CONTA") //Opcional
@SequenceGenerator(name="seqConta", sequenceName="SEQ_T_CONTA",allocationSize=1)
public class Conta {
	
	@Id //Decide quem será a primary key
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqConta") // faz a criação do Generation  e da Sequence
	@Column(name="NR_CONTA")
	private int numero;
	
	@Column(name="VL_SALDO",nullable=false)
	private float saldo;
	
	@Enumerated(EnumType.STRING) //Salva a "STRING" do Enum no BD
	private Status status;
	
	@Column(name="NM_TITULAR",nullable=false,length=100)
	private String nomeTitular;
	
	@Temporal(TemporalType.DATE) //Armazena somente a data no BD
	@Column(name="DT_ABERTURA")
	private Calendar dataCadastro;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

}
