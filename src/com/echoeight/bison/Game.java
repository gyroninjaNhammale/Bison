package com.echoeight.bison;

import com.echoeight.bison.display.DisplayManager;

public class Game {
	
	public DisplayManager dm;
	static Thread mainThread;
	
	public Game(int width, int height, String title){
		System.out.println("BISON Game Engine Starting...");
		dm = new DisplayManager(width, height, title);
	}
	
	public void save() {
		
	}
}