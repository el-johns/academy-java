package com.bptn.course._21_SolidPrinciples.InterfaceSegregationPrinciple;

// MultiFunctionPrinter.java
public class MultiFunctionPrinter implements Printer, Scanner, Fax {
	public void printDocument() {
		System.out.println("Printing document...");
	}

	public void scanDocument() {
		System.out.println("Scanning document...");
	}

	public void faxDocument() {
		System.out.println("Faxing document...");
	}
}
