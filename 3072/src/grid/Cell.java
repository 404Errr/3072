package grid;

public class Cell {
	private int q, r, s, n;

	public Cell(int q, int r, int s) {
		this.q = q;
		this.r = r;
		this.s = s;
		this.n = 0;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getQ() {
		return q;
	}

	public int getR() {
		return r;
	}

	public int getS() {
		return s;
	}

	@Override
	public String toString() {
		return n+"";
	}
	
	
}