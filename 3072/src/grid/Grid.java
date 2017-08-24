package grid;

public class Grid {
	public Cell[][][] grid;
	private int c;

	public Grid(int size) {
		grid = new Cell[size][size][size];
		c = size/2;
		for (int q = -size/2;q<=size/2;q++) {
			for (int r = -size/2;r<=size/2;r++) {
				for (int s = -size/2;s<=size/2;s++) {
					if (q+r+s==0) {
						add(q, r, s, new Cell(q, r, s, 0));
					}
				}
			}
		}
	}
	
	public void set(int q, int r, int s, int n) {
		grid[c-q][c-r][c-s].setN(n);
	}
	
	public void add(int q, int r, int s, Cell cell) {
		grid[c-q][c-r][c-s] = cell;
	}
	
	public Cell get(int q, int r, int s) {
		return grid[c+q][c+r][c+s];
	}
}