package com.bptn.course._21_SolidPrinciples.InterfaceSegregationPrinciple;

public interface Printer {

	void printDocument();

	void scanDocument();

	void faxDocument();
}

// * These Interface is too large with multiple methods, it forces implementing
// * classes - SimplePrinter - to implement two more methods (scanDocument and
// * faxDocument) which it doesn't need. This adds unnecessary complexity and
// * coupling. IS Principle requires that Printer, Scanner and Fax methods are
// * segregated into their own interface so that a class like Simple Printer can
// * implement only the interface it needs - Printer with printDocument() method.
// 