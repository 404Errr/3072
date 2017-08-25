package main;

import java.util.ArrayList;
import java.util.Collections;
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
		boolean changed = false, rev = false;
		int rotations = 0;
		switch (dir) {
		case U:
			break;
		case UR:
			rotations = 1;
			rev = true;
			break;
		case DR:
			rotations = 2;
			break;
		case D:
			rev = true;
			break;
		case DL:
			rotations = 1;
			break;
		case UL:
			rotations = 2;
			rev = true;
			break;
		}
		grid.rotate(rotations);
		for (int q = -grid.size()/2;q<=grid.size()/2;q++) {
			List<Cell> collumn = new ArrayList<>();
			for (int r = -grid.size()/2;r<=grid.size()/2;r++) {
				for (int s = grid.size()/2;s>=-grid.size()/2;s--) {
					if (q+r+s==0) {
						collumn.add(grid.get(q, r, s));
					}
				}
			}
			if (rev) Collections.reverse(collumn);
			for (int i = 0;i<collumn.size();i++) {
				for (int j = 1;j<collumn.size();j++) {
					if (collumn.get(j).getN()!=0&&collumn.get(j).getN()==collumn.get(j-1).getN()) {
						collumn.get(j-1).setN(collumn.get(j-1).getN()*2);
						collumn.get(j).setN(0);
						changed = true;
					}
					if (collumn.get(j).getN()!=0&&collumn.get(j-1).getN()==0) {
						collumn.get(j-1).setN(collumn.get(j).getN());
						collumn.get(j).setN(0);
						changed = true;
					}
				}
			}
		}
		grid.rotate(3-rotations);
		if (changed) addRandom();
	}

}