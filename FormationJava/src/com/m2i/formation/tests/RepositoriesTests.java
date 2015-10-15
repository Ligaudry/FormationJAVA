package com.m2i.formation.tests;

import java.io.IOException;
import java.util.*;

import org.junit.*;

import com.m2i.formation.media.repositories.*;
import com.m2i.formation.media.entities.*;

public class RepositoriesTests {

	/*@Test
	public void testGetCache() throws IOException {
		BookRepository br = new BookRepository();
		br.setUri("C:\\Users\\adminlocal\\git\\FormationJava\\src\\PackageparDefaut\\listLivre.txt");
		
	}*/
	
	
	
	@Test
	public void testCacheFactory() throws IOException {
		BookRepository br = new BookRepository();
		br.setUri("C:\\Users\\adminlocal\\git\\FormationJava\\src\\PackageparDefaut\\listLivre.txt");
		List<Book> books = br.cacheFactory();
		
		Assert.assertEquals("Contes nomades", books.get(0).getTitle());
	}
	
	@Test
	public void testGetAll() throws IOException {
		
		BookRepository br = new BookRepository();
		br.setUri("C:\\Users\\adminlocal\\git\\FormationJava\\src\\PackageparDefaut\\listLivre.txt");
		
		//List<Book> books = br.getAll();
		
		//Assert.assertEquals("Contes nomades", books.get(0).getTitle());
		
		Assert.assertEquals(9, br.getAll().size());
		
	}
	
	
	@Test
	public void testGetById() throws IOException{
		BookRepository br = new BookRepository();
		br.setUri("C:\\Users\\adminlocal\\git\\FormationJava\\src\\PackageparDefaut\\listLivre.txt");
		
		Assert.assertEquals("Contes nomades",br.getById(021).getTitle());
	}

	
	@Test
	public void testGetByPrice() throws IOException{
		BookRepository br = new BookRepository();
		br.setUri("C:\\Users\\adminlocal\\git\\FormationJava\\src\\PackageparDefaut\\listLivre.txt");
		List<Book> booksPrice = br.getByPrice(20);
		
		Assert.assertEquals(4,booksPrice.size());
	}

}
