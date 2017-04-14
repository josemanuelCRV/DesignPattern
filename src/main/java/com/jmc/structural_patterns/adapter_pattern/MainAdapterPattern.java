package com.jmc.structural_patterns.adapter_pattern;

import com.jmc.structural_patterns.adapter_pattern.adapter.MyPlayerAdapter;

public class MainAdapterPattern {
	
	public static void startMyPlayer(){
		MyPlayerAdapter myPlayer = new MyPlayerAdapter();
		myPlayer.play("mpg", "The GoodFather.mpg");
		myPlayer.play("mp3", "Queen.mp3");
	}
	
}
