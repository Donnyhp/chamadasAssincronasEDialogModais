package com.universidade.model;

import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Funcionario {
	@Id
	private String matricula;
	private String nome;
	private Date dataCadastro;
	
	@ManyToOne
	@JoinColumn(name="idDepto", nullable=false)
	private Departamento departamento;
	
	public Funcionario() { }
	
	public String getMatricula() {return matricula;}
	public void setMatricula(String matricula) {this.matricula = matricula;}
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public Date getDataCadastro() {return dataCadastro;}
	public void setDataCadastro(Date dataCadastro) {this.dataCadastro = dataCadastro;}
	public Departamento getDepartamento() {return departamento;}
	public void setDepartamento(Departamento departamento) {this.departamento = departamento;}
}
