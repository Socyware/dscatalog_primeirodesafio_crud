package com.socyware.dscatalog_primeirodesafio_crud.entity;

import java.time.Instant;
import java.util.Objects;

public class Client {
	
	private Long id;
	private String name;
	private Double cpf;
	private Instant birthDate;
	private Integer children;
	
  public Client() {	  
  }

public Client(Long id, String name, Double cpf, Instant birthDate, Integer children) {
	super();
	this.id = id;
	this.name = name;
	this.cpf = cpf;
	this.birthDate = birthDate;
	this.children = children;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Double getCpf() {
	return cpf;
}

public void setCpf(Double cpf) {
	this.cpf = cpf;
}

public Instant getBirthDate() {
	return birthDate;
}

public void setBirthDate(Instant birthDate) {
	this.birthDate = birthDate;
}

public Integer getChildren() {
	return children;
}

public void setChildren(Integer children) {
	this.children = children;
}

@Override
public int hashCode() {
	return Objects.hash(birthDate, children, cpf, id, name);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Client other = (Client) obj;
	return Objects.equals(birthDate, other.birthDate) && Objects.equals(children, other.children)
			&& Objects.equals(cpf, other.cpf) && Objects.equals(id, other.id) && Objects.equals(name, other.name);
}


  
  
  
}
