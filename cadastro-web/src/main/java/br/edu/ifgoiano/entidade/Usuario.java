package br.edu.ifgoiano.entidade;

import java.util.Date;

public class Usuario {
	private Integer incremento = 1;
	private Integer id;
	private String nome;
	private String email;
	private String senha;
	private Date dataNascimento;
	
	public Usuario() {
		this.id = incremento ++;
	}
	
	
	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Integer obterNascimento() {
		return 0;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
}

