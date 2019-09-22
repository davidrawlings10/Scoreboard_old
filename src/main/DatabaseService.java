package main;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;

public class DatabaseService {
	private static Connection connection;
	private static Statement statement;
		
	private void establishConnection() {
		//System.out.println("DatabaseService establishConnection()");
		
		try {
			final String connectionString = "jdbc:mysql://localhost:3306/scoreboard";
			final String username = "root";
			final String password = "Xn9s2X11";
			connection = DriverManager.getConnection(connectionString, username, password);
			statement = connection.createStatement();
		}
		catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	private void ensureConnection() {
		//System.out.println("DatabaseService ensureConnection()");
		
		if (statement == null) {
			//System.out.println("DatabaseService ensureConnection() statement was null");
			establishConnection();
		} else {
			//System.out.println("DatabaseService ensureConnection() statement was DECLARED");
		}
	}
	
	public ResultSet query(String sql) {
		//System.out.println("DatabaseService query() : " + sql);
		
		ensureConnection();
		
		try {
			return statement.executeQuery(sql);
		} catch (Exception exception) {
			throw new RuntimeException(exception);
		}
	}
	
	public int update(String sql) {
		//System.out.println("DatabaseService query() : " + sql);
		
		ensureConnection();
		
		try {
			return statement.executeUpdate(sql);
		} catch (Exception exception) {
			throw new RuntimeException(exception);
		}
	}
	
	@Override
	protected void finalize() throws Throwable {
		//System.out.println("DatabaseService finalize()");
	     try {
	    	System.out.println("connection close");
			connection.close();
	     } finally {
	         super.finalize();
	     }
	 }
}
