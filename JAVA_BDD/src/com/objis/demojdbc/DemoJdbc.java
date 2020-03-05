package com.objis.demojdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DemoJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ok");
		sauverEnBase("jean");
		System.out.println("ok");
	}
	
	public static void sauverEnBase(String personne) {
		String url = "jdbc:mysql://localhost/formation";
		String login ="root";
		String passwd ="root";
		Connection cn= null;
		Statement st = null;
		try {
			System.out.println("0");
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection(url, login, passwd);
			System.out.println("00");
			st = cn.createStatement();
			String sql = "INSERT INTO 'javadb' ('personne') VALUES ('" + personne + "')";
			st.executeUpdate(sql);
			System.out.println("1");
		}
		catch(SQLException e) {
			e.printStackTrace();
			System.out.println("2");
		}
		catch(ClassNotFoundException e) {
			System.out.println("3");
			e.printStackTrace();
		}
		finally {
			try {
				System.out.println("4");
				cn.close();
				st.close();
			}catch(SQLException e) {
				System.out.println("5");
				e.printStackTrace();
			}
		}
	}

}
