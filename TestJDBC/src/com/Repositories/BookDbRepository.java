package com.Repositories;

import java.io.*;
import java.sql.*;
import java.util.*;
import com.Entities.*;

public class BookDbRepository implements IRepository {

	private String uri_config = "src/TestJDBC.properties";
	private String drv;
	private String url;
	private String user;
	private String psw;

	public List<Book> getAll() throws Exception {
		List<Book> listBooks = new ArrayList<Book>();
		setParameter();
		Class.forName(drv);
		Connection con = DriverManager.getConnection(url, user, psw);
		Statement stmt = con.createStatement();
		String strSQL = "SELECT media.title from media where media.type = 0";
		ResultSet rs = stmt.executeQuery(strSQL);

		while (rs.next()) {
			Book b = new Book();
			b.setTitle(rs.getString("title"));
			b.setPrice(rs.getDouble("price"));
			listBooks.add(b);
		}
		con.close();// je ferme la connection, il ferme tout ce qui est
					// sous-jacent, c'est plus propre, si on ne le ferme pas
					// c'est le garbage collector qui le fera mais c'est plus
					// propre
		return listBooks;

	}

	private Connection getConnection() throws Exception {
		setParameter();
		Class.forName(drv);
		Connection con = DriverManager.getConnection(url, user, psw);
		return con;
	}

	private List<Book> getByQuery(String strSQL) throws SQLException, Exception {
		List<Book> listBooks = new ArrayList<Book>();
		Statement stmt = getConnection().createStatement();
		ResultSet rs = stmt.executeQuery(strSQL);

		while (rs.next()) {
			Book b = new Book();
			b.setTitle(rs.getString("title"));
			b.setPrice(rs.getDouble("price"));
			listBooks.add(b);
		}
		getConnection().close();
		return listBooks;

	}

	@Override
	public String getUri() {// ça permet de
		return url;
	}

	@Override
	public void setUri(String uri) {
		url = uri;

	}

	@Override
	public Book getById(int id) throws Exception {
		setParameter();
		Book b = null;
		Class.forName(drv);
		Connection con = DriverManager.getConnection(url, user, psw);
		Statement stmt = con.createStatement();// donne le droit de faire une
												// requête
		String strSQL = "SELECT media.title from media where media.type = 0 and media.id =" + id;
		ResultSet rs = stmt.executeQuery(strSQL);
		while (rs.next()) {// il parcourt toutes les lignes
			b = new Book();
			b.setTitle(rs.getString("title"));
		}

		return b;
	}

	@Override
	public List<Book> getByPrice(double Price) {

		return null;
	}

	@Override
	public List<Book> getByTitle(String word) {
		// TODO Auto-generated method stub
		return null;
	}

	private void setParameter() throws Exception {
		Properties properties = new Properties();
		properties.load(new FileInputStream(uri_config));
		this.drv = properties.getProperty("nomDriver");
		this.url = properties.getProperty("url");
		this.user = properties.getProperty("user");
		this.psw = properties.getProperty("psw");

	}

}
