package br.com.omega5.celebrescristaos.backend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="TB_USUARIOS")
@Entity 
public class Usuario {
		
	@Id 
	@Column(name="ID", nullable=false) 	
	@GeneratedValue
	private Long id;
	
	@Column(name="LOGIN", nullable=false, length=10) 	
	private String login;
	
	@Column(name="SENHA", nullable=false, length=6) 	
	private String senha;
	
	@Column(name="NOME", nullable=false, length=30) 	
	private String nome;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
