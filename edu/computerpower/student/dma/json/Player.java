package edu.computerpower.student.dma.json;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private String username;
	private int highscore;
	
	public Player() {
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getHighscore() {
		return highscore;
	}
	public void setHighscore(int highscore) {
		this.highscore = highscore;
	}

}






//public List<Integer> getPreviousScore() {
//	return previouscores;
//}
//public void setPreviousScores(List<Integer> previousScores) {
//	this.previouscores = previousScores;
//}
//
//
//
//private List<Integer> previouscores = new ArrayList<Integer>();
//
//public Player(String userName, int highScore, List<Integer> previousScores) {
//	setUserName(userName);
//	setHighScore(highScore);
//	setPreviousScores(previousScores);
//}
