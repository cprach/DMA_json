package com.cp.dma.json;

import com.google.gson.Gson;

public class Start {

	public static void main(String[] args) {
	
		PlayerData pd = new PlayerData();
		String playerData = pd.readData();
		System.out.println(playerData);
		
		Gson gson = new Gson();
		PlayerManager p = gson.fromJson(playerData, PlayerManager.class);
		
		System.out.print(p.getPlayers().size());

	}

}
