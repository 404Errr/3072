package main;

import java.util.ArrayList;
import java.util.List;

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
		switch (dir) {
		case U:
			break;
		case UR:
			break;
		case DR:
			break;
		case D:
			break;
		case DL:
			break;
		case UL:
			break;
		}
		
		for (int q = -grid.size()/2;q<=grid.size()/2;q++) {
			List<Cell> col = new ArrayList<>();
			for (int r = -grid.size()/2;r<=grid.size()/2;r++) {
				for (int s = grid.size()/2;s>=-grid.size()/2;s--) {
					if (q+r+s==0) {
						//make list remove null blah blah combine
					}
				}
			}
		}
		
		addRandom();
	}

}
