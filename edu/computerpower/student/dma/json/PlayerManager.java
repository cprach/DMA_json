package edu.computerpower.student.dma.json;

import java.util.ArrayList;
import java.util.List;

public class PlayerManager {
	
	public PlayerManager() {
		
	}
	
	private List<Player> players = new ArrayList<Player>();

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

}
