
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/scoreboard", "root", "Xn9s2X11");
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery("SELECT * FROM game WHERE id = 2");
			resultSet.next();
			System.out.println(resultSet.getString("a_team_score"));
			
			//ResultSet myRs = myStmt.executeQuery("SELECT * FROM team WHERE id = 1");
			//myStmt.executeUpdate("INSERT INTO game (a_team_id, b_team_id, a_team_score, b_team_score) VALUES (1, 2, 1, 0)");
			//while (myRs.next()) {
			//	System.out.println(myRs.getString("a_team_score"));
			//}
			
			//Random rand = new Random();
			//System.out.println(rand.nextInt(5));
			//System.out.println(rand.nextInt(5));
			connection.close();
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
	}

}
