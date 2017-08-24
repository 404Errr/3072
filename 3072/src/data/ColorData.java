package data;

import java.awt.Color;

public interface ColorData {
	Color COLOR_ERROR = new Color(0x940e94);//magenta
	Color COLOR_BACKGROUND = new Color(0xf0f0f0);//background color
	
	Color[] COLORS = {
			new Color(0xFBFBCA),
			new Color(0xF4E6B2),
			new Color(0xFEDC9F),
			new Color(0xF7B55E),
			new Color(0xFF815B),
			new Color(0xFF530A),
			new Color(0xFFEC75),
			new Color(0xF3DE58),
			new Color(0xFFE923),
			new Color(0xFFD323),
			new Color(0xFFCF0F),
			new Color(0xF0BF0E),
			new Color(0x161616),
	};
	
	static Color getColor(double n) {
		return COLORS[(int)Math.min(n/3-1, COLORS.length-1)];
	}
}
