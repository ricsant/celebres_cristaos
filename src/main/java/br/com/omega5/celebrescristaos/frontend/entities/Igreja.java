package br.com.omega5.celebrescristaos.frontend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="TB_IGREJAS")
@Entity
public class Igreja {

	@Id 
	@Column(name="ID", nullable=false)
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	@JoinColumns({
			@JoinColumn(name = "ID", referencedColumnName = "ID_DENOMINACAO", nullable = false, insertable = false, updatable = false)
			})
	private Denominacao denominacao;
	
	@Column(name="ID_DENOMINACAO", nullable=false)
	private Long idDenominacao;
	
	@Column(name="NOME", nullable=false, length=100) 	
	private String nome;
	
	@Column(name="WEBSITE", length=100) 	
	private String website;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Long getIdDenominacao() {
		return idDenominacao;
	}

	public void setIdDenominacao(Long idDenominacao) {
		this.idDenominacao = idDenominacao;
	}
	
	
}
