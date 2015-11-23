package org.exemple.model;

import java.sql.*;
import java.util.*;

public class UtilisateurManager {

	private static final UtilisateurManager instance = new UtilisateurManager();

	public static final UtilisateurManager getInstance() {
		return UtilisateurManager.instance;

	}//singleton

	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; // création
																		// de
																		// constante
																		// pour
																		// voir
																		// ce
																		// qu'on
																		// fait
	private static final String JDBC_URL = "jdbc:mysql://localhost/jee";
	private static final String JDBC_USER = "root";
	private static final String JDBC_PASS = "root";

	

	private Map<Integer, Utilisateur> cache = new HashMap(); // on fait la
																// collection
																// Map en
																// singleton -
																// on utilise
																// une Map c'est
																// plus simple
																// pour gérer
																// getId

	public void add(Utilisateur user){
		
		this.cache.put(user.getId(),user);
	};

	public void remove(Utilisateur user){
		this.cache.remove(user.getId());
	}

	public void update(Utilisateur user){
		this.cache.replace(user.getId(), user);
	
	}

	public Utilisateur getById(int id){
		//Utilisateur user = this.cache.get(id);
		//return user;
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Utilisateur u = null;
		
		
try {
			// 1
			Class.forName(JDBC_DRIVER);
			System.out.println("Connection");
			conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
					
			
			// 2
			System.out.println("Statement...");
			//stmt = conn.createStatement();
			stmt = conn.prepareStatement("select * from user where id=?");
			
			
			// 3
			System.out.println("Send SQL...");
			//rs = stmt.executeQuery("select*from user;");//toutes les requetes sql se terminent pas ;
			//int rs = stmt.executeUpdate("insert into user values (55, 'prince', 'dieulefit','8 rue du saumon')");
			//System.out.println(rs);//int car on retrouve le nom de lignes insérées
			stmt.setInt(1,id);
			rs = stmt.executeQuery();
			
			
			if (rs.next()) {// un seul résultat à afficher donc pas de boucle
							// while
				u= new Utilisateur();
				u.setId(rs.getInt("id"));
				u.setFirstname(rs.getString("firstname"));
				u.setLastname(rs.getString("lastname"));
				u.setAddress(rs.getString("address"));
			}
			
			// 4 
			
			/*if(rs.next()){//un seul résultat à afficher donc pas de boucle while
				System.out.print("Utilisateur | " + rs.getInt("id"));
				System.out.print(" - " + rs.getString("firstname"));
				System.out.print(" - " + rs.getString("lastname"));
				System.out.println(" - " + rs.getString("address"));
			}*/
						
		
		}
		catch (Exception e){
			System.out.println("UtilisateurManager.getById()" + e.getMessage());;
		}
		
		finally {
			
			System.out.println("Exiting...");
			
			try {
				if(stmt!=null)
					stmt.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
			try {
				if(conn!=null)
					conn.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
return u;


		
		
		
	}

	public List<Utilisateur> getAll(){
		final List<Utilisateur> result = new ArrayList<>();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try

		{
			Class.forName(JDBC_DRIVER);//comme le driver n'est pas sur l'application on lui rappelle l'endroit où il est 
			conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from user;");// toutes les requetes sql se terminent par ;

			while (rs.next()) {
				Utilisateur u = new Utilisateur();
				u.setId(rs.getInt("id"));
				u.setFirstname(rs.getString("firstname"));
				u.setLastname(rs.getString("lastname"));
				u.setAddress(rs.getString("address"));
				result.add(u);

			}

		} catch(SQLException e)

		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally

		{

			System.out.println("Exiting...");

			try {
				if (stmt != null)
					stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
				
		
		return result;
	}
	

}
