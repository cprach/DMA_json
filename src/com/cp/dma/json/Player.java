package com.cp.dma.json;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private String userName;
	private int highScore;
	private List<Integer> previousScore = new ArrayList<Integer>();
	
	public Player() {
		
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getHighScore() {
		return highScore;
	}
	public void setHighScore(int highScore) {
		this.highScore = highScore;
	}
	public List<Integer> getPreviousscore() {
		return previousScore;
	}
	public void setPreviousscore(List<Integer> previousscore) {
		this.previousScore = previousscore;
	}
	
	
	
	

}
