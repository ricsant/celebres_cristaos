package br.com.omega5.celebrescristaos.frontend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="TB_PAISES")
@Entity
public class Pais {

	@Id 
	@Column(name="ID", nullable=false)
	@GeneratedValue
	private Long id;
	
	@Column(name="NOME", nullable=false, length=80) 	
	private String nome;
	
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
	
	
	
}
