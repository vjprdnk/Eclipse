import java.io.*;
import java.math.*;
import java.security.*;
//import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import java.time.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

	public class Main {

		
	    public static void main(String[] args) {    
	        Scanner sc=new Scanner(System.in);
	   
	        String A = "";
	        int noTokens = 0;
	        A = sc.nextLine();
	        
	        A= A.trim();
	        
	        boolean Aalphaonly = true;
	        
	        
	        
	        sc.close();
	               
	        if (A.length() >= 1 && 
	            A.length() <= 4*Math.pow(10,5))         
	        {
	        
	        String[] tokens = A.split("[\\s!,?._'@]+");
	        
	        
	        
	        noTokens = tokens.length;
	        
	        for (int i = 0; i < noTokens; i++) {
	        	if(Pattern.matches("[A-Za-z!,?._'@]+", tokens[i])) {
	        		Aalphaonly = true;
	        	}
	        	else {Aalphaonly = false;}
	        }
	        
	        System.out.println(noTokens);
	        
	        for (int i = 0; i < noTokens && Aalphaonly; i++) {
	        	System.out.println("i= " + tokens[i] + " " + tokens[i].length() + "\n");
	        }
	        }
	        if (A.isEmpty()){
	        	noTokens = 0;
	        	System.out.println(noTokens);
	        	
	        }
	        
	    }
	}
