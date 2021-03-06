package br.edu.univas.si5.bd2.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Candidatos")
public class Candidatos {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "regSeqGen1")
	@SequenceGenerator(name = "regSeqGen1", sequenceName = "SEQ_CANDIDATOS", allocationSize = 1)
	private Integer id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="email")
	private String email;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataNasc;
	
	@ManyToOne
	@JoinColumn(name="vaga_fk")
	private Vaga vaga;
	
	public Candidatos() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Vaga getVaga() {
		return vaga;
	}
	
	public void setVaga(Vaga vaga) {
		this.vaga = vaga;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getDataNasc() {
		return dataNasc;
	}
	
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	@Override
	public String toString() {
		return "Candidato: [id=" + id + ", nome=" + nome + ", email=" + email + ", nascimento=" + dataNasc + "]";
	}

}
