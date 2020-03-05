package tp_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoJDBC {

	public static void sauverEnBase(String personne)
	{
		// Information d'acc�s � la base de donn�es
		String url ="jdbc:mysql://localhost:8889/formation";
		String login = "root";
		String password = "root";
		
		Connection connection = null;
		Statement statement = null;
		
		try
		{
			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Etape 2 : R�cup�ration de la connexion
			connection = DriverManager.getConnection(url, login, password);
			
			// Etape 3 : Cr�ation d'un statement
			statement = connection.createStatement();
			
			String sql = "INSERT INTO `javadb` (`personne`) VALUES ('" + personne + "')";
			
			// Etape 4 : Ex�cution requ�te
			statement.executeUpdate(sql);
			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				// Etape 5 : Lib�rer ressources de la m�moire
				connection.close();
				statement.close();
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void majVilles(String test) {
		// Information d'acc�s � la base de donn�es
				String url ="jdbc:mysql://localhost:8889/formation";
				String login = "root";
				String password = "root";
				ResultSet result2=null;
				
				Connection connection = null;
				Statement statement = null;
				
				try
				{
					// Etape 1 : Chargement du driver
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					// Etape 2 : R�cup�ration de la connexion
					connection = DriverManager.getConnection(url, login, password);
					
					// Etape 3 : Cr�ation d'un statement
					statement = connection.createStatement();
					//statement.executeUpdate("CREATE TABLE test_table(test_col VARCHAR(254) PRIMARY KEY)");
					
					String sql = "INSERT INTO `test_table` (`test_col`) VALUES ('" + test + "')";
					
					// Etape 4 : Ex�cution requ�te
					statement.executeUpdate(sql);
					
					String sql2 = "SELECT * FROM javadb";
					
					// Etape 4 : Ex�cution requ�te
					result2 = statement.executeQuery(sql2);
					
					String query = "delete from test_table where id = gio";
					statement.executeUpdate(query);
				}
				catch (SQLException e)
				{
					e.printStackTrace();
				}
				catch (ClassNotFoundException e)
				{
					e.printStackTrace();
				}
				finally
				{
					try
					{
						// Etape 5 : Lib�rer ressources de la m�moire
						connection.close();
						statement.close();
					}
					catch (SQLException e)
					{
						e.printStackTrace();
					}
				}
	}
	
	public static void lireEnBase()
	{
		// Information d'acc�s � la base de donn�es
		//String url = "jdbc:mysql://127.0.0.1/formation?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String url ="jdbc:mysql://localhost:8889/formation";
		String login = "root";
		String password = "root";
		
		Connection connection = null;
		Statement statement = null;
		ResultSet result = null;
		
		try
		{
			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Etape 2 : R�cup�ration de la connexion
			connection = DriverManager.getConnection(url, login, password);
			
			// Etape 3 : Cr�ation d'un statement
			statement = connection.createStatement();
			
			String sql = "SELECT * FROM javadb";
			
			// Etape 4 : Ex�cution requ�te
			result = statement.executeQuery(sql);
			
			// Etape 5 : Parcourir le r�sultat
			while (result.next())
			{
				System.out.println(result.getString("personne"));
			}
			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				// Etape 5 : Lib�rer ressources de la m�moire
				connection.close();
				statement.close();
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		sauverEnBase("Jean");
		lireEnBase();
		majVilles("gio5");
		majVilles("paul5");
	}

}
