package com.bridgelabs.pincode;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {
	
	public static void main(String[] args) 
    { 
  
		System.out.println("Welcome to Pincode problem");
        String regex = "[0-9]{6}"; 
        String pincode = "400088"; 
        
        
        Pattern pattern = Pattern.compile(regex); 
  
        
        
        Matcher matcher = pattern.matcher(pincode); 
        System.out.println("Pattern match is: " + matcher.find()); 
    } 
}