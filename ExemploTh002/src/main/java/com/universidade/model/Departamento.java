package com.universidade.model;

import java.util.Set;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Departamento {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idDepto;
	private String nome;
	
	@OneToMany(mappedBy="departamento")
	private Set<Funcionario> funcionarios;
	
	public Departamento() { }
	
	public Integer getIdDepto() {return idDepto;}
	public void setIdDepto(Integer idDepto) {this.idDepto = idDepto;}
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}

}
