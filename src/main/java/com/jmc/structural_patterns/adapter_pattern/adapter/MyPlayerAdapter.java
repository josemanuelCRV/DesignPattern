package com.jmc.structural_patterns.adapter_pattern.adapter;

import com.jmc.structural_patterns.adapter_pattern.interfaces.IAudioPlayer;
import com.jmc.structural_patterns.adapter_pattern.interfaces.IPlayer;
import com.jmc.structural_patterns.adapter_pattern.interfaces.IVideoPlayer;
import com.jmc.structural_patterns.adapter_pattern.models.MyAudioPlayer;
import com.jmc.structural_patterns.adapter_pattern.models.MyVideoPlayer;

public class MyPlayerAdapter implements IPlayer {

	static IAudioPlayer audioPlayer = new MyAudioPlayer();
	static IVideoPlayer videoPlayer = new MyVideoPlayer();

	public MyPlayerAdapter() {
	}

	public void play(String type, String fileName) {
		if (type.equalsIgnoreCase("mpg")) {
			videoPlayer.playVideo(fileName);
		} else if (type.equalsIgnoreCase("mp3")) {
			audioPlayer.playAudio(fileName);
		}

	}

}
