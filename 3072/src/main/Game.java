package main;

import java.util.ArrayList;

import data.GameData;
import grid.Cell;
import grid.Grid;

public class Game implements GameData {
	public static Grid grid;
	
	public static void init() {
		grid = new Grid(GRID_SIZE);
		Game.addRandom();
		Game.addRandom();
	}
	
	public static void addRandom() {
		boolean success = grid.setRandomEmpty(3);
		if (!success) {
			System.out.println("u lose");
		}
	}
	
	public static void move(int dir) {
		int dQ = 0, dR = 0, dS = 0;
		switch (dir) {
		case U:
			dR = -1;
			dS = 1;
			break;
		case UR:
			dQ = 1;
			dR = -1;
			break;
		case DR:
			dQ = 1;
			dS = -1;
			break;
		case D:
			dR = 1;
			dS = -1;
			break;
		case DL:
			dQ = -1;
			dR = 1;
			break;
		case UL:
			dQ = -1;
			dS = 1;
			break;
		}
		
		addRandom();
	}

}
