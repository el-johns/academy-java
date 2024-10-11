package com.bptn.course._21_SolidPrinciples.InterfaceSegregationPrinciple;

public class Main {

	public static void main(String[] args) {
		Printer simplePrinter = new SimplePrinter();
		simplePrinter.printDocument();

		MultiFunctionPrinter mfp = new MultiFunctionPrinter();
		mfp.printDocument();
		mfp.scanDocument();
		mfp.faxDocument();
	}

}
