package com.jmc.creational_patterns.singleton_pattern;

public class MainSingletonWindow {
	   //create an object of MainWindow
	   private static MainSingletonWindow instance = new MainSingletonWindow();

	   //make the constructor private so that this class cannot be
	   //instantiated by other class
	   private MainSingletonWindow(){}

	   //Get the only object available
	   public static MainSingletonWindow getInstance(){
	      return instance;
	   }

	   public void showMessage(){
	      System.out.println("Hello World!");
	   }
	}