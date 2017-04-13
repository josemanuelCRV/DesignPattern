package com.jmc.creational_patterns.builder_pattern;

import com.jmc.creational_patterns.builder_pattern.objects.Menu;
import com.jmc.creational_patterns.builder_pattern.objects.ToolBar;

public class MainBuildedWindow {

	Menu menu;
	ToolBar toolBar;

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public ToolBar getToolBar() {
		return toolBar;
	}

	public void setToolBar(ToolBar toolBar) {
		this.toolBar = toolBar;
	}

}
