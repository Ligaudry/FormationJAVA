package com.exempleCyrilVincentTestJDBC;

import java.io.*;
import java.sql.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		/*
		 * String drv="com.mysql.jdbc.Driver"; String
		 * url="jdbc:mysql://localhost/test";
		 */

		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("src/TestJDBC.properties"));
		} catch (IOException e) {
			System.out.println("erreur: load properties:" + e);
			return;
		}

		for (String key : properties.stringPropertyNames()) {
			String value = properties.getProperty(key);
			System.out.println(key + " => " + value);
		}
		
		String drv = properties.getProperty("nomDriver");
		String url = properties.getProperty("url");
		String user = properties.getProperty("user");
		String psw = properties.getProperty("psw");
		

		try {
			Class.forName(drv);
		} catch (Exception ex) {
			System.out.println("erreur: driver jdbc-odbc:" + ex);
			return;
		}

		/*
		 * try { String strSQL=
		 * "INSERT INTO test.author (firstName, lastName) VALUES ('Johanna', 'Brakenstock')"
		 * ; Connection con =
		 * DriverManager.getConnection(properties.getProperty("url"),"root",
		 * "root"); Statement stmt=con.createStatement();
		 * stmt.executeUpdate(strSQL); int n =
		 * stmt.executeUpdate(strSQL);//compteur stmt.close(); con.close();
		 * System.out.println(n); } catch (Exception ex ) { System.out.println(
		 * "SQL exception: "+ex); }
		 */

//		try {
//			String strSQL = "INSERT INTO test.mediaauthor (id, id_Media) VALUES ('4', '6')";
//			Connection con = DriverManager.getConnection(url, "root", "root");
//			Statement stmt = con.createStatement();
//			stmt.executeUpdate(strSQL);
//			int n = stmt.executeUpdate(strSQL);// compteur
//			stmt.close();
//			con.close();
//			System.out.println(n);
//		} catch (Exception ex) {
//			System.out.println("SQL exception: " + ex);
//		}

		try {
			String strSQL = "SELECT * from media";
			Connection con = DriverManager.getConnection(url, user, psw);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(strSQL);
			while (rs.next()) {
				System.out.println(rs.getString("title")+ " | "+rs.getLong("price") + "€");
			}
		} catch (Exception ex) {
			System.out.println("SQL exception: " + ex);
		}

		try {
			String strSQL = "SELECT a.title, c.lastname FROM media as a inner join mediaauthor as b on a.id = b.id_media inner join author as c on b.id = c.id";
			Connection con = DriverManager.getConnection(url, "root", "root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(strSQL);
			while (rs.next()) {
				System.out.println(rs.getString("a.title") + " |" + rs.getString("c.lastname"));
			}
		} catch (Exception ex) {
			System.out.println("SQL exception: " + ex);
		}

	}

}
