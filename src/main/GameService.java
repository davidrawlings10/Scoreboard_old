package main;

import java.util.Random;

public class GameService {
	public static void playGame(long a_team_id, long b_team_id, Sport sport) {		
		switch (sport) {
			case RANDOM:
				playRandom(a_team_id, b_team_id);
				break;
		}
	}
	
	private static void playRandom(long a_team_id, long b_team_id) {
		Random rand = new Random();
		int a_score = rand.nextInt(6);
		int b_score = rand.nextInt(6);
		
		insertGame(a_team_id, b_team_id, a_score, b_score);
	}
	
	private static void insertGame(long a_team_id, long b_team_id, int a_score, int b_score) {
		DatabaseService databaseService = new DatabaseService();
		databaseService.update(String.format("INSERT INTO game (a_team_id, b_team_id, a_team_score, b_team_score) VALUES (%d, %d, %d, %d)", a_team_id, b_team_id, a_score, b_score));
	}
}
