package com.Test;

import static org.junit.Assert.*;

import java.io.*;
import java.sql.*;
import java.util.*;

import org.junit.*;

import com.Entities.Book;
import com.Repositories.BookDbRepository;

public class RepositoriesTest {

	@Test
	public void getAll() throws Exception {
		BookDbRepository repo = new BookDbRepository();
		List<Book> l = repo.getAll();
		Assert.assertTrue(l.size()>0);
		
	}
	
	@Test
	public void getById() throws Exception {
		BookDbRepository repo = new BookDbRepository();
		Book b = repo.getById(4);
		Assert.assertNotNull(b);
		
	}

}
