package com.bptn.course._05_strings;

public class Strings {

	public static void main(String[] args) {
		String userName = "Charles Okpara";
		String newName = "PEACE OKPARA";
		String myName = "Okpara";
		System.out.println(userName.length());
		System.out.println(userName.charAt(2));
		System.out.println(userName.substring(3,9));
		System.out.println(userName.substring(3,5));
		System.out.println(userName.indexOf("les"));
		System.out.println(myName.compareTo("Charles"));
		System.out.println(myName.compareTo("CHARLES"));
		System.out.println(myName.compareToIgnoreCase("CHARLES"));
		System.out.println(userName.equals("Charles"));
		System.out.println(myName.equals("OKPARA"));
		System.out.println(myName.equalsIgnoreCase("OKPARA"));
		System.out.println(myName.toUpperCase());
		System.out.println(newName.toLowerCase());
	
		}
		
}
