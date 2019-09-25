package main;

import java.util.Random;

public class GameService {
	public static void playGame(long a_team_id, long b_team_id, Sport sport, long season_id) {		
		switch (sport) {
			case RANDOM:
				playRandom(a_team_id, b_team_id, season_id);
				break;
		}
	}
	
	private static void playRandom(long a_team_id, long b_team_id, long season_id) {
		Random rand = new Random();
		
		final int maxScore = 6;
		
		int a_score = rand.nextInt(maxScore);
		int b_score = rand.nextInt(maxScore);
		
		insertGame(a_team_id, b_team_id, a_score, b_score, season_id);
	}
	
	private static void insertGame(long a_team_id, long b_team_id, int a_score, int b_score, long season_id) {
		DatabaseService databaseService = new DatabaseService();
		databaseService.update(String.format("INSERT INTO game (a_team_id, b_team_id, a_team_score, b_team_score, season_id) VALUES (%d, %d, %d, %d, %d)", a_team_id, b_team_id, a_score, b_score, season_id));
	}
}
