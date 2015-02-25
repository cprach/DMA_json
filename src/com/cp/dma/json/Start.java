package com.cp.dma.json;

import com.google.gson.Gson;

public class Start {

	public static void main(String[] args) {
	
		PlayerData pd = new PlayerData();
		String playerData = pd.readData();
		System.out.println("Player data: " + playerData);
		
		Gson gson = new Gson();
		ServerManager sm = gson.fromJson(playerData, ServerManager.class);

		System.out.println("Number of servers: " + sm.getServers().size());
		
	}

}
