package main;

import java.sql.ResultSet;

public class Main {
	public static void main(String[] args) {
		try {
			GameService.playGame(1, 2, Sport.RANDOM, 1);
			
			
			
			
			
			/*DatabaseService databaseService = new DatabaseService();
			final String sql = "SELECT * FROM game WHERE id = 2";
			final ResultSet list = databaseService.query(sql);
			list.next();
			System.out.println(list.getString("a_team_id") + " : " + list.getString("a_team_score"));
			System.out.println(list.getString("b_team_id") + " : " + list.getString("b_team_score"));
			
			final String sql2 = "INSERT INTO game (a_team_id, b_team_id, a_team_score, b_team_score) VALUES (1, 2, 1, 0)";
			databaseService.update(sql2);
			
			databaseService = null;*/
			
			
			
			
			
			//Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/scoreboard", "root", "Xn9s2X11");
			//Statement statement = connection.createStatement();
			
			//ResultSet list = statement.executeQuery("SELECT * FROM game WHERE id = 2");
			
			//ResultSet myRs = myStmt.executeQuery("SELECT * FROM team WHERE id = 1");
			
			//statement.executeUpdate(sql2);
			
			//while (myRs.next()) {
			//	System.out.println(myRs.getString("a_team_score"));
			//}
			
			//Random rand = new Random();
			//System.out.println(rand.nextInt(5));
			//System.out.println(rand.nextInt(5));
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
	}

}
