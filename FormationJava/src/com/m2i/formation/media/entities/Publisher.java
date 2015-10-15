package com.m2i.formation.media.entities;

public class Publisher implements IEntity {
	private long siret;
	private String corporateName;
	private String country;
	private String city;
	private int id;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getSiret() {
		return siret;
	}
	public void setSiret(long siret) {
		this.siret = siret;
	}
	public String getCorporateName() {
		return corporateName;
	}
	public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}