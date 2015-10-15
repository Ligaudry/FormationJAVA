package com.m2i.formation.media.repositories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;



import com.m2i.formation.media.entities.*;

public class BookRepository implements IRepository {

	public BookRepository() { }

	private String uri;
	
	
	
	@Override
	public String getUri() {
		return uri;
	}

	@Override
	public void setUri(String uri) {
		 this.uri = uri;
	
	}

	private List<Book> cache = null; // je crée une variable dans laquelle je stockerai mes livres
	
	private List<Book> getCache () throws IOException{// singleton on static, j'ai 1 cache par instance
		if (cache== null){
			cache = cacheFactory();
		}
		
		return cache;
	}
	
	public List<Book> cacheFactory() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(uri));
		String line = br.readLine();
		line = br.readLine();
		
		List<Book> books = new ArrayList<Book>();	
		
		while(line!=null) {//tant que ma ligne n'est pas vide
			Book b = new Book();
			StringTokenizer st = new StringTokenizer(line,";");
			b.setTitle(st.nextToken());
			String stringPublisher = st.nextToken();
			Publisher p = new Publisher();
			p.setCorporateName(stringPublisher);
			b.setEditeur(p);
			b.setPrice(Double.parseDouble(st.nextToken()));//caster grace à parse pour transformer le string en double
			b.setId(Integer.parseInt(st.nextToken()));
			books.add(b);
			line=br.readLine();
			
		}
		br.close();
		
		
		return books;
	}
	
	@Override
	 public List<Book> getAll() throws IOException{
		return cacheFactory();
	}

	
	@Override
	public Book getById(int id) throws IOException {
		List<Book> liste = getAll();		
		Book bookTampon = null;
		for (Book b2 : liste){
			if (b2.getId() == id){
				bookTampon = b2;
				}	
			
		}
		
	return bookTampon;
		
	}
	

	@Override
	public List<Book> getByPrice(double price) throws IOException {
		List<Book> books = new ArrayList<Book>();
		for(Book b : getAll()){
			if (b.getPrice() <= price){
				books.add(b);
			}
		}
		return books;
	}

	@Override
	public List<Book> getByTitle(String word) throws IOException {
		List<Book> books = new ArrayList<Book>();
		for (Book b : getAll()){
			if (b.getTitle().toUpperCase().contains(word.toUpperCase())){
				books.add(b);
			}
		}
		
		return books;

	}

}
