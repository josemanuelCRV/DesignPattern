package com.jmc.structural_patterns.adapter_pattern.models;

import com.jmc.structural_patterns.adapter_pattern.interfaces.IVideoPlayer;

public class MyVideoPlayer implements IVideoPlayer{

	public void playVideo(String fileName) {
		System.out.println("Playing Video >> Name: "+ fileName);
		
	}

}
