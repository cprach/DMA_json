package edu.computerpower.student.dma.json;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private String username;
	private int highscore;
	
	public Player() {
		
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String userName) {
		this.username = userName;
	}
	public int getHighScore() {
		return highscore;
	}
	public void setHighScore(int highScore) {
		this.highscore = highScore;
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
