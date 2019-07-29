package com.cg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Country")
public class Country {

	@Id
	private String code;
	@Column(name="name",length=20)
	private String name;
	@Column(name="continent",length=20)
	private String continent;
	@Column(name="capital",length=20)
	private String capital;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Country(String code, String name, String continent, String capital) {
		super();
		this.code = code;
		this.name = name;
		this.continent = continent;
		this.capital = capital;
	}
	
	
}
