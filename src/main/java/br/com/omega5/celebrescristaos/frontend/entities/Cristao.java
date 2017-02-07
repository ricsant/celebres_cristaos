package br.com.omega5.celebrescristaos.frontend.entities;

import java.sql.Blob;
import java.sql.Clob;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import br.com.omega5.celebrescristaos.backend.entities.Pais;

@Table(name="TB_CRISTAOS")
@Entity
public class Cristao {

	@Id 
	@Column(name="ID", nullable=false) 	
	@GeneratedValue
	private Long id;
	
	@Column(name="NOME", nullable=false, columnDefinition="VARCHAR(30)") 	
	private String nome;
	
	@Column(name="DT_NASCIMENTO", nullable=false)
	private Date dtNascimento;
	
	@Column(name="DT_FALECIMENTO") 	
	private Date dtFalecimento;
	
	@ManyToOne
	@JoinColumn(name="ID_PAIS")	
	private Pais pais;
	
	@OneToMany
	private List<Frase> frase;
	
	@Column(name="FOTO") 	
	private Blob foto;
	
	@Column(name="BIOGRAFIA") 	
	private Clob biografia;
	
	@Transient
	public Integer getIdade() {
		
		return new Integer(1);
		
	}
}
