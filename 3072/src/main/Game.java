package main;

import data.GameData;
import grid.Grid;

public class Game implements GameData {
	public static Grid grid;
	
	public static void init() {
		grid = new Grid(GRID_SIZE);
	}
	
	public static void addRandom() {
		
	}

}
