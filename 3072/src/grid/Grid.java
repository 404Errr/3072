package grid;

import java.util.ArrayList;
import java.util.Collections;

public class Grid {
	public Cell[][][] grid;
	private ArrayList<Cell> allCells;
	private int c;

	public Grid(int size) {
		grid = new Cell[size][size][size];
		allCells = new ArrayList<>();
		c = size/2;
		for (int q = -size/2;q<=size/2;q++) {
			for (int r = -size/2;r<=size/2;r++) {
				for (int s = -size/2;s<=size/2;s++) {
					if (q+r+s==0) {
						Cell cell = new Cell(q, r, s);
						add(q, r, s, cell);
						allCells.add(cell);
					}
				}
			}
		}
	}
	
	public boolean setRandomEmpty(int n) {
		Collections.shuffle(allCells);
		for (int i = 0;i<allCells.size();i++) {
			if (allCells.get(i)!=null&&allCells.get(i).getN()==0) {
				allCells.get(i).setN(n);
				return true;
			}
		}
		return false;
	}
	
	public void rotate(int rotations) {
		for (int rots = 0;rots<rotations;rots++) {
			int[][][] ns = new int[size()][size()][size()];
			for (int q = -size()/2;q<=size()/2;q++) {
				for (int r = -size()/2;r<=size()/2;r++) {
					for (int s = -size()/2;s<=size()/2;s++) {
						if (q+r+s==0) ns[c-s][c-r][c-q] = getN(q, r, s);
					}
				}
			}
			for (int q = -size()/2;q<=size()/2;q++) {
				for (int r = -size()/2;r<=size()/2;r++) {
					for (int s = -size()/2;s<=size()/2;s++) {
						if (q+r+s==0) set(-s, -q, -r, ns[c-s][c-r][c-q]);
					}
				}
			}
		}
	}
	
	public void set(int q, int r, int s, int n) {
		grid[c-s][c-r][c-q].setN(n);
	}
	
	public void add(int q, int r, int s, Cell cell) {
		grid[c-s][c-r][c-q] = cell;
	}
	
	public Cell get(int q, int r, int s) {
		if (q+r+s!=0) return null;
		return grid[c+s][c+r][c+q];
	}
	
	public int getN(int q, int r, int s) {
		if (q+r+s!=0) return 0;
		return grid[c+s][c+r][c+q].getN();
	}
	
	public int size() {
		return grid.length;
	}
}