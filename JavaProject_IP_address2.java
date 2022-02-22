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


//NOT WORKING
	public class Main {

		private static boolean IPmatches(String s, String regexStr) {
			boolean AValidonly = true;
	          
		    Pattern p  =  Pattern.compile(regexStr);
		    Matcher m  =  p.matcher(s);
		    AValidonly =  m.matches();
		    
		   // System.out.println("str " + s + " regexStr " + regexStr + " AValidonly " + AValidonly);
		        
		    return(AValidonly); 

			
		}
		
	    public static void main(String[] args) {    
	        Scanner sc=new Scanner(System.in);
	   
	        String A = "";
	        String regexStr = "([0-9.]{1,3}){3,4}+";
	        
	        A = sc.nextLine();
	        
	        A= A.trim();
	        
	        boolean AValidonly = true;
	       
	        
	       
	        Pattern p = Pattern.compile(regexStr);
	        Matcher m  =  p.matcher(A);
	        AValidonly =  m.matches();
	        
	        
	        //A.matches(regexStr);
	        
	       //if (IPmatches(A, regexStr)) {
	         if (AValidonly) {
	       // if (A.matches(regexStr)) {
	        	System.out.println("true");
	        }
	        else {
	        	System.out.println("false");
	        }
	       
	        
	        sc.close();
	      	        
	    }
	}

