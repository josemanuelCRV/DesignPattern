package com.jmc.structural_patterns.decorator_pattern;

import com.jmc.structural_patterns.decorator_pattern.decorator.modeldecore.Climatizador;
import com.jmc.structural_patterns.decorator_pattern.decorator.modeldecore.GpsModule;
import com.jmc.structural_patterns.decorator_pattern.decorator.modeldecore.Printer3D;
import com.jmc.structural_patterns.decorator_pattern.decorator.modeldecore.TechoSolar;
import com.jmc.structural_patterns.decorator_pattern.interfaces.IPrinter;
import com.jmc.structural_patterns.decorator_pattern.interfaces.IVendible;
import com.jmc.structural_patterns.decorator_pattern.interfaces.impl.PaperPrinterImpl;
import com.jmc.structural_patterns.decorator_pattern.interfaces.impl.PlasticPrinterImpl;
import com.jmc.structural_patterns.decorator_pattern.interfaces.impl.ModelsAutos.Ferrari;
import com.jmc.structural_patterns.decorator_pattern.interfaces.impl.ModelsAutos.Porsche;

public class Main {

	public static void main(String[] args) {

		callPrinterDecorator();

		callDecoratorAuto1();

		callDecoratorAuto2();

	}

	private static void callPrinterDecorator() {
		IPrinter plasticPrinter = new PlasticPrinterImpl();
		// Using decorator
		IPrinter plastic3DPrinter = new Printer3D(new PlasticPrinterImpl());
		IPrinter paper3DPrinter = new Printer3D(new PaperPrinterImpl());
		plasticPrinter.print();
		plastic3DPrinter.print();
		paper3DPrinter.print();
	}

	private static void callDecoratorAuto1() {
		IVendible auto = new Ferrari();
		auto = new Climatizador(auto);
		auto = new GpsModule(auto);
		System.out.println(auto.getDescription() + "\nCon un precio: " + auto.getPrecio());
	}
	
	private static void callDecoratorAuto2() {
		IVendible auto = new Porsche();
		auto = new Climatizador(auto);
		auto = new TechoSolar(auto);
		System.out.println(auto.getDescription() + "\nCon un precio: " + auto.getPrecio());
	}

	

}
