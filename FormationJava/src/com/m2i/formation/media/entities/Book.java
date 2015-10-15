package com.m2i.formation.media.entities;


public class Book extends Media {

	private Publisher editeur;
	private int nbPage;
	private String isbn;
	private String lang;
	private Author[] auteurs = new Author[10];
	private int nbAut=0;
	private BookCategory category;
	private double VATPrice;

	
	public Publisher getEditeur() {
		return editeur;
	}
	public void setEditeur(Publisher editeur) {
		this.editeur = editeur;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public Author[] getAuteurs() {
		return auteurs;
	}
	public void setAuteurs(Author[] auteurs) {
		this.auteurs = auteurs;
	}
	public BookCategory getCategory() {
		return category;
	}
	public void setCategory(BookCategory category) {
		this.category = category;
	}
	public int getNbPage() {
		return nbPage;
	}
	public int getNbAut() {
		return nbAut;
	}
	
	/*public void addAuthor(Author a) throws MediaException {
		if(nbAuthor > 10) {
			throw new MediaException("Too many authors");
		}
		authors[nbAuthor++] = a;
	
	}*/
	
	@Override
	public double getVATPrice(){
		return getPrice()*1.05;
	}
	
	public int getEvaluation() {
		// TODO Auto-generated method stub
		return 0;
	}
}
