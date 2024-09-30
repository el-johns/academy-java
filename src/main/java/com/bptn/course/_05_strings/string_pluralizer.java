package com.bptn.course._05_strings;
import java.util.Scanner;
public class string_pluralizer{
	public static  String main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String singular;
		singular = scan.nextLine();
		String CONSONANTS = "bcdfghjklmnpqrstvwxz";
	    switch (singular) {
	        case "Person":
	            return "People";
	            break;
	        case "Trash":
	            return "Trash";
	            break;
	        case "Life":
	            return "Lives";
	            break;
	        case "Man":
	            return "Men";
	            break;
	        case "Woman":
	            return "Women";
	            break;
	        case "Child":
	            return "Children";
	            break;
	        case "Foot":
	            return "Feet";
	            break;
	        case "Tooth":
	            return "Teeth";
	            break;
	        case "Dozen":
	            return "Dozen";
	            break;
	        case "Hundred":
	            return "Hundred";
	            break;
	        case "Thousand":
	            return "Thousand";
	            break;
	        case "Million":
	            return "Million";
	            break;
	        case "Datum":
	            return "Data";
	            break;
	        case "Criterion":
	            return "Criteria";
	            break;
	        case "Analysis":
	            return "Analyses";
	            break;
	        case "Fungus":
	            return "Fungi";
	            break;
	        case "Index":
	            return "Indices";
	            break;
	        case "Matrix":
	            return "Matrices";
	            break;
	        case "Settings":
	            return "Settings";
	            break;
	        case "UserSettings":
	            return "UserSettings";
	            break;
	        default:
	            // Handle ending with "o" (if preceeded by a consonant, end with -es, otherwise -s: Potatoes and Radios)
	            if (singular.endsWith("o") && CONSONANTS.Contains(singular[singular.length() - 2].toString()))
	            {
	                return singular + "es";
	            }
	            // Handle ending with "y" (if preceeded by a consonant, end with -ies, otherwise -s: Companies and Trays)
	            if (singular.endsWith("y") && CONSONANTS.Contains(singular[singular.length() - 2].toString()))
	            {
	                return singular.substring(0, singular.length() - 1) + "ies";
	            }
	            // Ends with a whistling sound: boxes, buzzes, churches, passes
	            if (singular.endsWith("s") || singular.endsWith("sh") || singular.endsWith("ch") || singular.endsWith("x") || singular.endsWith("z"))
	            {
	                return singular + "es";
	            }
	            return singular + "s";
	            }
	    scan.close();
	    }
	}
/* Requires passing strings that have the first letter capitalized. Still a work in progress but this is how far I have reached before the submission deadline. */
