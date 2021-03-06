package br.edu.univas.si5.bd2.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Vaga")
public class Vaga {
	
	@Id
	@Column(name="codigo")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "regSeqGen2")
	@SequenceGenerator(name = "regSeqGen2", sequenceName = "SEQ_VAGA", allocationSize = 1)
	private Integer codigo;
	
	@OneToMany(mappedBy="vaga")
	private Set<Candidatos> candidatos;
	
	@OneToOne
	@JoinColumn(name = "detalhes_fk")
	private VagaDetalhes detalhes;
	
	@Column(name="contratante")
	private String contratante;
	
	public Vaga() {
		// TODO Auto-generated constructor stub
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Set<Candidatos> getCandidatos() {
		return candidatos;
	}

	public void setCandidatos(Set<Candidatos> candidatos) {
		this.candidatos = candidatos;
	}

	public VagaDetalhes getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(VagaDetalhes detalhes) {
		this.detalhes = detalhes;
	}

	public String getContratante() {
		return contratante;
	}

	public void setContratante(String contratante) {
		this.contratante = contratante;
	}
	
	@Override
	public String toString() {
		return "Vaga: [codigo=" + codigo + ", contratante=" + contratante + "]";
	}

}
