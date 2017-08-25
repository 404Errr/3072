package data;

import java.awt.Color;

public interface ColorData {
	Color COLOR_ERROR = new Color(0x940e94);//magenta
	Color COLOR_BACKGROUND = new Color(0xf0f0f0);//background color
	
	Color[] COLORS = {
			new Color(0xFFFFD0),
			new Color(0xFFEFB0),
			new Color(0xFEDC9F),
			new Color(0xF7B55E),
			new Color(0xFF815B),
			new Color(0xF0830A),
			new Color(0xFFEC75),
			new Color(0xF3DE58),
			new Color(0xFFE923),
			new Color(0xFFD323),
			new Color(0xFFCF0F),
			new Color(0xF0BF0E),
			new Color(0x161616),
	};
	
	static Color getColor(int n) {
		switch (n) {
		case 3: return COLORS[0];
		case 6: return COLORS[1];
		case 12: return COLORS[2];
		case 24: return COLORS[3];
		case 48: return COLORS[4];
		case 96: return COLORS[5];
		case 192: return COLORS[6];
		case 384: return COLORS[7];
		case 768: return COLORS[8];
		case 1536: return COLORS[9];
		case 3072: return COLORS[10];
		case 6144: return COLORS[11];
		}
		return COLORS[COLORS.length-1];
	}
}
