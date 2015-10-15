package com.m2i.formation.media.repositories;

import java.io.IOException;
import java.util.*;

public interface IRepository<T> {
	
	String getUri();// dans une interface on ne met pas ce qui est private donc on ne met pas l'uri mais son "getter" et son "setter"
	void setUri(String uri);
	
	List<T> getAll() throws IOException;
	T getById(int id) throws IOException;
	List<T> getByPrice(double Price) throws IOException;
	List<T> getByTitle(String word) throws IOException;
}

//implements IRepository<Book>
