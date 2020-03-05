import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EtudiantEcole {

	private static void creerBase()
	{
		// Information d'acc�s � la base de donn�es
		String url = "jdbc:mysql://localhost:8889/formation";
		String login = "root";
		String password = "root";
		
		Connection connection = null;
		Statement statement = null;
		ResultSet result = null;
		
		try
		{
			System.out.println("yay");
			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Etape 2 : R�cup�ration de la connexion
			connection = DriverManager.getConnection(url, login, password);
			System.out.println("yey");
			
			// Etape 3 : Cr�ation d'un statement
			statement = connection.createStatement();
			
			String query ="CREATE DATABASE IF NOT EXISTS EtudiantEcole";
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
	
	private static void creerTable()
	{
		// Information d'acc�s � la base de donn�es
		String url = "jdbc:mysql://localhost:8889/EtudiantEcole";
		String login = "root";
		String password = "root";
		
		Connection connection = null;
		Statement statement = null;
		ResultSet result = null;
		
		try
		{
			System.out.println("yay");
			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Etape 2 : R�cup�ration de la connexion
			connection = DriverManager.getConnection(url, login, password);
			System.out.println("yey");
			
			// Etape 3 : Cr�ation d'un statement
			statement = connection.createStatement();
			
			String query ="CREATE TABLE IF NOT EXISTS Etudiant(numEtudiant VARCHAR(254) PRIMARY KEY,"+"nomEtudiant VARCHAR(45),"+"prenomEtudiant VARCHAR(45))";
			String query2 ="CREATE TABLE IF NOT EXISTS Ecole(nomEcole VARCHAR(254) PRIMARY KEY,"+"adresse VARCHAR(45))";
			statement.executeUpdate(query);
			statement.executeUpdate(query2);
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
	
	private static void updateEtudiant(int etudiant)
	{
		// Information d'acc�s � la base de donn�es
		String url = "jdbc:mysql://localhost:8889/EtudiantEcole";
		String login = "root";
		String password = "root";
		
		Connection connection = null;
		Statement statement = null;
		ResultSet result = null;
		
		try
		{
			System.out.println("yay");
			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Etape 2 : R�cup�ration de la connexion
			connection = DriverManager.getConnection(url, login, password);
			System.out.println("yey");
			
			// Etape 3 : Cr�ation d'un statement
			statement = connection.createStatement();
			
			String query ="CREATE TABLE IF NOT EXISTS Etudiant(numEtudiant VARCHAR(254) PRIMARY KEY,"+"nomEtudiant VARCHAR(45),"+"prenomEtudiant VARCHAR(45))";
			String query2 ="CREATE TABLE IF NOT EXISTS Ecole(nomEcole VARCHAR(254) PRIMARY KEY,"+"adresse VARCHAR(45))";
			statement.executeUpdate(query);
			statement.executeUpdate(query2);
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
	
	public static void main(String[] args)
	{
		
		creerBase();
		creerTable();
		
	}

}
