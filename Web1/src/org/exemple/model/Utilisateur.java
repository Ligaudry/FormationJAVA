package org.exemple.model;

public class Utilisateur {

	private int id;
	private String firstname;
	private String lastname;
	private String address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toJSON(){
		StringBuffer sb = new StringBuffer();
		sb.append("{")
		.append("\"id\":").append(this.id).append(",")
		.append("\"firstname\":").append(this.firstname).append(",")
		.append("\"lastname\":").append(this.lastname).append(",")
		.append("\"address\":").append(this.address).append(",")
		.append("}");
		return sb.toString();
	}
	
	public String toXML(){
		StringBuffer sb = new StringBuffer();
		sb.append("<utilisateur>")
		.append("<id>").append(this.id).append("</id>")
		.append("<firstname>").append(this.firstname).append("</firstname>")
		.append("<lastname>").append(this.id).append("</lastname>")
		.append("<address>").append(this.id).append("</address>")	
		.append("</utilisateur>");
		return sb.toString();
	}
	
	public String toDefault(){
	
		return this.toString();
		
	}
	
	
}
