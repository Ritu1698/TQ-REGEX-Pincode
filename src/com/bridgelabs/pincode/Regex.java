package com.bridgelabs.pincode;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {
	
	public static void main(String[] args) 
    { 
  
		System.out.println("Welcome to Pincode problem");
        String regex = "^[0-9]{3}(\\s{0,1})[0-9]{3}$"; 
        String pincode = "400088"; 
        String pincode1 = "A400088";
        String pincode2 = "400088B";
        String pincode3 = "400 088";
        
        Pattern pattern = Pattern.compile(regex); 
  
        
        
        Matcher matcher = pattern.matcher(pincode); 
        Matcher matcher1 = pattern.matcher(pincode1);
        Matcher matcher2 = pattern.matcher(pincode2);
        Matcher matcher3 = pattern.matcher(pincode3);
        System.out.println("Pattern match is: " + matcher.find()); 
        System.out.println("Pattern match is: " + matcher1.find());
        System.out.println("Pattern match is: " + matcher2.find());
        System.out.println("Pattern match is: " + matcher3.find());
    } 
}