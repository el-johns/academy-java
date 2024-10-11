package com.bptn.course._21_SolidPrinciples.InterfaceSegregationPrinciple;

//The SimplePrinter Class Implements methods which it does not, violating the IS Principle
//ISP - Clients should not be forced to depend on interfaces they do not use
public class SimplePrinter implements Printer {
	public void printDocument() {
		System.out.println("Printing document...");
	}

	public void scanDocument() {
		// Not implemented
	}

	public void faxDocument() {
		// Not implemented
	}

	public static void main(String[] args) {
		SimplePrinter printer = new SimplePrinter();
		printer.printDocument();
	}

}
