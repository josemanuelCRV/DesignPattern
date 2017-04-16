package com.jmc.structural_patterns.adapter_pattern.models;

import com.jmc.structural_patterns.adapter_pattern.interfaces.IAudioPlayer;

public class MyAudioPlayer implements IAudioPlayer{

	public void playAudio(String fileName) {
		System.out.println("Playing Audio >> Name: "+ fileName);
		
	}

}
