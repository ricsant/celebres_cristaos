package br.com.omega5.celebrescristaos.frontend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="TB_FRASES")
@Entity
public class Frase {

	@Id 
	@Column(name="ID", nullable=false) 	
	@GeneratedValue
	private Long id;
	
	@Column(name="FRASE", nullable=false, length=4000) 	
	private String frase;
	
	@ManyToOne
	@JoinColumn(name="ID")
	private Cristao cristao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrase() {
		return frase;
	}
	public void setFrase(String frase) {
		this.frase = frase;
	}
	public Cristao getCristao() {
		return cristao;
	}
	public void setCristao(Cristao cristao) {
		this.cristao = cristao;
	}
	
}
