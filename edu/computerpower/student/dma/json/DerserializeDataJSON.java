package edu.computerpower.student.dma.json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class DerserializeDataJSON {
	
	private String readDataFromFile(String fileName) {
		File f = new File(fileName);
		try {
			Reader r = new FileReader(f);
			StringBuilder sb = new StringBuilder();
			int i = 0;
			while ((i = r.read()) != -1) {
				char c = (char)i;
				sb.append(c);
			}
			r.close();
			System.out.println(sb.toString());
			return sb.toString();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	public ServerManager deserializeServerData() {
		Gson gson = new Gson();
		ServerManager sm = gson.fromJson(readDataFromFile("serverdatajson.json"), ServerManager.class);
		return sm;
	}
	
	public PlayerManager deserializePlayerListData() {
		Gson gson = new Gson();
		PlayerManager p = gson.fromJson(readDataFromFile("playerdatajson.json"), PlayerManager.class);
		return p;
	}
	
	public Player deserializeSinglePlayerData() {
		Gson gson = new Gson();
		Player deserialisedPlayer = gson.fromJson(readDataFromFile("singleplayerdatajson.json"), Player.class);
		System.out.println("username: " + deserialisedPlayer.getUserName());
		System.out.println("highscore: " + deserialisedPlayer.getHighScore());
		
		String j = gson.toJson(deserialisedPlayer);
		
		System.out.println(j);

		return deserialisedPlayer;
	}
	
	public void deserializePlayerData(String jsonString) {
		Gson gson = new Gson();
		Player p = gson.fromJson(jsonString, Player.class);
		
		String j = gson.toJson(p);
	}
	
	public String serializePlayerObject(Player player) {
		Gson gson = new Gson();		
		String jsonPlayerData = gson.toJson(player);
		System.out.println(jsonPlayerData);
		return jsonPlayerData;
	}
	
	public void deserializePlayerListData(String jsonString) {
		Gson gson = new Gson();
//		PlayerManager p = gson.fromJson(readDataFromFile("playerdatajson.json"), PlayerManager.class);
		List<Player> pl = gson.fromJson(readDataFromFile("playerdatajson.json"), new TypeToken<List<Player>>(){}.getType());
System.out.println(pl.size());
		//return p;
	}
	
	

}
