package com.jmc.structural_patterns;

import com.jmc.structural_patterns.adapter_pattern.MainAdapterPattern;
import com.jmc.structural_patterns.bridge_pattern.MainBridgePattern;
import com.jmc.structural_patterns.filter_pattern.MainFilterPattern;

public class MainStructuralPatterns {
	
	public static void main(String[] args){
		
		// AdapterPattern
		MainAdapterPattern.startMyPlayer();
		
		// BridgePattern
		MainBridgePattern.startBridgePattern();
		
		//Filter Pattern
		MainFilterPattern.startMainFilterPattern();
		
	}
	

}
