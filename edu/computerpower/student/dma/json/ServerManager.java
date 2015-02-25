package edu.computerpower.student.dma.json;

import java.util.ArrayList;
import java.util.List;

public class ServerManager {
	
	List<Server> servers = new ArrayList<Server>();
	
	public ServerManager() {
		
	}

	public List<Server> getServers() {
		return servers;
	}

	public void setServers(List<Server> servers) {
		this.servers = servers;
	}
	
	

}
