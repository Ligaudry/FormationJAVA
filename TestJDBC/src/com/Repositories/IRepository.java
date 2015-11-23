package com.Repositories;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

public interface IRepository<T> {
	
	String getUri();// dans une interface on ne met pas ce qui est private donc on ne met pas l'uri mais son "getter" et son "setter"
	void setUri(String uri);
	
	List<T> getAll() throws Exception ;
	T getById(int id) throws Exception ;
	List<T> getByPrice(double Price) throws IOException;
	List<T> getByTitle(String word) throws IOException;
}

//implements IRepository<Book>
