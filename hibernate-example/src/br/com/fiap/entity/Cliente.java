package br.com.fiap.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_CLIENTE")
@SequenceGenerator(name="seqCliente", sequenceName="SEQ_T_CLIENTE", allocationSize=1)
public class Cliente {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqCliente")
	@Column(name="COD_CLIENTE")
	private int codigo;
	
	@Column(name="NOM_CLIENTE", nullable=false, length=200)
	private String nome;
	
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
	
	
}
