package Projet;

import java.util.Date;

public abstract class Media extends Item {
	
	private String title;
	private Date date;
	private double VATPrice;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public abstract double getVATPrice();
}
