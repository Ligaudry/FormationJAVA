package com.m2i.formation.jsf.managedBeans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="bookController")

public class BookController {
	
	private BookBean book = new BookBean();
	
	public String getSampleBook(){
		book = new BookBean();
		book.setId(1);
		book.setTitle("Sample");
		book.setPrice(10.5);
		
		//return "showBook"; //pour éviter de se planter dans l'orthographe on fait une énumération
		return BookControllerEnum.showBook.toString();
		
	}
	
	public String insertBook(){
		//on devrait faire un insert dans la BD
		return BookControllerEnum.showBook.toString();
		
	}

	public BookBean getBook() {
		return book;
	}

	public void setBook(BookBean book) {
		this.book = book;
	}

}
