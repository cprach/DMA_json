package edu.computerpower.student.dma.json;

import com.google.gson.Gson;

public class Start {

	public static void main(String[] args) {
	
//		PlayerData pd = new PlayerData();
//		String playerData = pd.readData();
//		System.out.println("Player data: " + playerData);
//		
//		Gson gson = new Gson();
//		ServerManager sm = gson.fromJson(playerData, ServerManager.class);
//
//		System.out.println("Number of servers: " + sm.getServers().size());
		
		DerserializeDataJSON d = new DerserializeDataJSON();
		//ServerManager s = d.deserializeServerData();
		//System.out.println(s.getServers().size());
		//PlayerManager pm = d.deserializePlayerListData();
		//System.out.println(pm.getPlayers().size());
		//Player p = d.deserializeSinglePlayerData();
		//System.out.println(p.xxx());
		//d.serializePlayerObject(p);
		//d.deserializePlayerData();
//d.deserializePlayerListData(d.serializePlayerObject(p));
		//d.deserializePlayerListData(d.readDataFromFile("playerdatajson.json"));
		d.serialisePlayerList();
		
	}

}
