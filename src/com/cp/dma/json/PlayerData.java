package com.cp.dma.json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class PlayerData {
		
	public String readData() {
		File f = new File("playerdatajson.json");
		try {
			Reader r = new FileReader(f);
			StringBuilder sb = new StringBuilder();
			int i = 0;
			while ((i = r.read()) != -1) {
				char c = (char)i;
				sb.append(c);
			}
			r.close();
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

}
