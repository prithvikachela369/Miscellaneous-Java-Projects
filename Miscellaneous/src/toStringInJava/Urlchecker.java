package toStringInJava;

import java.net.URL;

public class Urlchecker {
	// Java program to check if a URL is valid  
	// using java.net.url 
	  
	    /* Returns true if url is valid */
	    public static boolean isValid(String url) 
	    { 
	        /* Try creating a valid URL */
	        try { 
	            new URL(url).toURI(); 
	            return true; 
	        } 
	          
	        // If there was an Exception 
	        // while creating URL object 
	        catch (Exception e) { 
	            return false; 
	        } 
	    } 
	      
	    /*driver function*/    
	    public static void main(String[] args) 
	    { 
	        String url1 = "https://www.google.com/search?q=java.lang.illegalargumentexception%3A+unknown+uri+content%3A%2F%2Fcom.example.tasktimer.provider%2Ftimings&oq=&aqs=chrome.0.35i39i362l6j46i39i362j35i39i362...8.182345482j0j15&sourceid=chrome&ie=UTF-8"; 
	        if (isValid(url1))  
	            System.out.println("The Url is valid :)"); 
	        else
	            throw new IllegalArgumentException("The Url is not valid");      
	              
	    }
	} 

