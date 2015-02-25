package edu.computerpower.student.dma.json;

import java.util.ArrayList;
import java.util.List;

public class Server {
	
	private int id;
	private String region;
	private String serverName;
	private List<Player> players = new ArrayList<Player>();
	
	public Server() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	

}
