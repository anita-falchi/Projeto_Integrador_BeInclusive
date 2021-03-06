package org.beinclusive.beinclusive.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import org.beinclusive.beinclusive.utils.EnumAvaliacao;
import org.beinclusive.beinclusive.utils.EnumCategoria;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.v3.oas.annotations.media.Schema;

@Entity
@Table(name = "tb_usuario")
public class Usuario{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Schema
	@Email
	@NotNull
	private String email;
	
	@NotNull
	private String senha;
	
	@NotNull
	private String nome;
	
	@Enumerated(EnumType.STRING)
	private EnumCategoria categoria;
	
	
	@Enumerated(EnumType.STRING)
	private EnumAvaliacao avaliacao;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("usuario")
	private List<PostagemModel> postagem;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
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


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public EnumCategoria getCategoria() {
		return categoria;
	}


	public void setCategoria(EnumCategoria categoria) {
		this.categoria = categoria;
	}


	public EnumAvaliacao getAvaliacao() {
		return avaliacao;
	}


	public void setAvaliacao(EnumAvaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	public List<PostagemModel> getPostagem() {
		return postagem;
	}


	public void setPostagem(List<PostagemModel> postagem) {
		this.postagem = postagem;
	}

	

	

}
