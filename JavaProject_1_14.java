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
	    	//String regex = "^(.*)\1$";
	 //   	String regex = "^(.*)\1$";  need to try 
	    	String regex = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*";
	        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

	        Scanner in = new Scanner(System.in);
	        int numSentences = Integer.parseInt(in.nextLine());
	        
	        while (numSentences-- > 0) {
	            String input = in.nextLine();
	            
	            Matcher m = p.matcher(input);
	            
	            System.out.println("while 1" + m.matches());
	            
	            // Check for subsequences of input that match the compiled pattern
	            while (m.find()) {
	            	System.out.println("while 2");
	                input = input.replaceAll(m.group(0), m.group(1));
	                
	          
	            }
	            
	            // Prints the modified sentence.
	            System.out.println(input);
	        }
	        
	        in.close();	       	        
	    }
	}
