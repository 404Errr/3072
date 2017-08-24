package main;

import graphics.Window;

public class Main3072 {
	public static void main(String[] args) {
		Game.init();
		Window.init();
		Thread update = new Thread(new UpdateLoop(), "UL");
		update.start();
		

//		Game.run();
	}
}