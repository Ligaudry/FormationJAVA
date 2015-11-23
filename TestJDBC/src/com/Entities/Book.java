package com.Entities;
public class Book extends Media {

	private int nbPage;
	private String isbn;
	private BookCategory category;
	public int getNbPage() {
		return nbPage;
	}
	public void setNbPage(int nbPage) {
		this.nbPage = nbPage;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public BookCategory getCategory() {
		return category;
	}
	public void setCategory(BookCategory category) {
		this.category = category;
	}
	
	@Override
	public double getVATPrice() {
		return getPrice() * 1.05;
	}
	public int getEvaluation() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}