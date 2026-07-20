package com.generation.blogpessoal.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity // Gera uma tabela
@Table(name = "tb_temas") // CREATE TABLE tb_postagens();
public class Tema {

	@Id // PRIMARY KEY
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
	private Long id;
	
	@NotBlank(message = "O atributo descrição é obrigatório!")
	@Size(min = 5, max = 100, message = "O atributo descrição deve ter no mínimo 5 e no máximo 100 caracteres")
	@Column(length = 100)
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
