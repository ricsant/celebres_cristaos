package br.com.omega5.celebrescristaos.frontend.entities;

@Table(name="TB_IGREJAS")
@Entity
public class Igreja {

	@Id 
	@Column(name="ID", nullable=false)
	@GeneratedValue
	private Long id;
	
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
	
	
}
