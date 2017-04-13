package com.jmc.creational_patterns.builder_pattern.builder;

import com.jmc.creational_patterns.builder_pattern.MainBuildedWindow;
import com.jmc.creational_patterns.builder_pattern.objects.Menu;
import com.jmc.creational_patterns.builder_pattern.objects.ToolBar;

public class WindowBuilder {
	
	public static MainBuildedWindow createWindow() {
		MainBuildedWindow window = new MainBuildedWindow();
		Menu menu = new Menu();
		ToolBar toolBar = new ToolBar();
		window.setMenu(menu);
		window.setToolBar(toolBar);
		return window;
	}
	
	
}