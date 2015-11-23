package com.exemple;
import java.sql.*;

public class App {
	
	private static final String JDBC_DRIVER = "com.msql.jdbc.Driver"; //cr�ation de constante pour voir ce qu'on fait
	private static final String JDBC_URL = "jdbc:mysql://localhost/jee";
	private static final String JDBC_USER = "root";
	private static final String JDBC_PASS = "root";
	
	

	public static void main(String[] args) {
		
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs;
		
		try {
			
			// premi�re �tape je me connecte
			System.out.println("Connection");
			conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
					
			
			// deuxi�me �tape je cr�e un statement
			System.out.println("Statement...");
			//stmt = conn.createStatement();
			stmt = conn.prepareStatement("insert into user values (?,?,?,?);");
			
			
			// troisi�me �tape 
			System.out.println("Send SQL...");
			//rs = stmt.executeQuery("select*from user;");//toutes les requetes sql se terminent pas ;
			//int rs = stmt.executeUpdate("insert into user values (55, 'prince', 'dieulefit','8 rue du saumon')");
			//System.out.println(rs);//int car on retrouve le nom de lignes ins�r�es
			stmt.setInt(1,111);
			stmt.setString(2,"Elise");
			stmt.setString(3, "surve");
			stmt.setString(4,"4 rue du foin");
			stmt.executeUpdate();
			
			stmt.setInt(1,105);
			stmt.setString(2,"Lucie");
			stmt.setString(3, "Loi");
			stmt.setString(4,"4 rue du risquen");
			stmt.executeUpdate();
			rs = stmt.executeQuery("select*from user;");
			// 4 �me �tape afficher le r�sultat renvoy� par la base
			
			while(rs.next()){//on utilise .next pour �viter de consommer trop de m�moire, pour des questions de performance
				System.out.print("Utilisateur | " + rs.getInt("id"));
				System.out.print(" - " + rs.getString("firstname"));
				System.out.print(" - " + rs.getString("lastname"));
				System.out.println(" - " + rs.getString("address"));
			}
		}
		catch (SQLException e){
			e.printStackTrace();
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

		
		
		
		
	}

}
