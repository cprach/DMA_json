package edu.computerpower.student.dma.json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class DerserializeDataJSON {

	public String readDataFromFile(String fileName) {
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
			e.printStackTrace();
		} catch (IOException e) {
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
		System.out.println("username: " + deserialisedPlayer.getUsername());
		System.out.println("highscore: " + deserialisedPlayer.getHighscore());

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
		PlayerManager playerManager = gson.fromJson(jsonString, PlayerManager.class);
		
		System.out.println("Size of list: " + playerManager.getPlayers().size() + "\n");
		
		for (Player p: playerManager.getPlayers()) {
			Player currentPlayer = p;
			System.out.println("username: " + currentPlayer.getUsername());
			System.out.println("highscore: " + currentPlayer.getHighscore() + "\n");
		}
	}
	
	public void serialisePlayerList() {
		Type listType = new TypeToken<List<Player>>(){}.getType();
		Gson gson = new Gson();
		String jsonPlayerList = gson.toJson(deserializePlayerListData().getPlayers(), listType);
		System.out.println(jsonPlayerList);
	}
	
	public void serialisePlayerList(List<Player> playerList) {
		Type listType = new TypeToken<List<Player>>(){}.getType();
		Gson gson = new Gson();
		String jsonPlayerList = gson.toJson(playerList, listType);
		System.out.println(jsonPlayerList);
	}



}
