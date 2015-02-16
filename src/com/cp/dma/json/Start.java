package com.cp.dma.json;

import com.google.gson.Gson;

public class Start {

	public static void main(String[] args) {
	
		PlayerData pd = new PlayerData();
		String s = pd.readData();
		System.out.println(s);
		
		Gson gson = new Gson();
		PList p = gson.fromJson(s, PList.class);
		
		System.out.print(p.getPlayers().size());

	}

}
