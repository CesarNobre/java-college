package br.com.fiap.entity;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="T_CONTA")
@SequenceGenerator(name="seqConta", sequenceName="SEQ_I_CONTA", allocationSize=1)
public class Conta {
	
	@Id
	@Column(name="NR_CONTA")
	private int numero;
	
	@Column(name="VL_SALDO", nullable=false)
	private float saldo;
	
	@Column(name="DS_STATUS")
	@Enumerated(EnumType.STRING)
	private Status status;
	
	@Column(name="NM_TITULAR", length=100,nullable=false)
	private String nomeTitular;
	
	@Temporal(value=TemporalType.DATE)
	@Column(name="DT_ABERTURA", length=100)
	private Calendar dataAbertura;

	public Conta(int numero, float saldo, Status status, String nomeTitular){
		this.numero = numero;
		this.saldo = saldo;
		this.status = status;
		this.nomeTitular = nomeTitular;
		this.dataAbertura = new GregorianCalendar(TimeZone.getDefault());
	}
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

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	
}
