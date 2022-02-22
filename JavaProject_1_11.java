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
	   
	        /*
	        int noInputs = sc.nextInt();
	      
	        String[] inputStrArr = new String[noInputs];
	        
	        
	        for (int i = 1; i <= noInputs; i++) {
	            inputStrArr[i - 1] = sc.next();   
	        }
	        for (int i = 0; i < noInputs; i++) {    
	        	System.out.println("s= " + inputStrArr[i] + " " + inputStrArr[i].length());
	            try {
                   Pattern p =  Pattern.compile(inputStrArr[i]);
                   System.out.println("Valid");
	            } catch (PatternSyntaxException e) {
                   System.out.println("Invalid");
	            } 

	        }
	        */
	        
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int noInputs = 0;
	        
	        try {
	           noInputs = Integer.parseInt(bufferedReader.readLine());
	        } catch (IOException e) {
	               System.out.println("No. Of Inputs IO Exception");
	            }
	        
	     
	        
	        for (int i = 0; i < noInputs; i++) {    
	            try {
                   Pattern p =  Pattern.compile(bufferedReader.readLine());
                   System.out.println("Valid");
	            } catch (PatternSyntaxException e) {
                   System.out.println("Invalid");
	            } catch (IOException e) {
	               System.out.println("IO");
	            }

	        }

	        
	        
	        
	     }       
	}