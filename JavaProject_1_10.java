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
	        String A=sc.next();
	        String B=sc.next();
	        
	        boolean Aalphaonly, Balphaonly;
	        A = A.toLowerCase();
	        B = B.toLowerCase();
	        
	        Aalphaonly = Pattern.matches("[A-Za-z]+", A);
	        Balphaonly = Pattern.matches("[A-Za-z]+", B);
	        
	        if(Aalphaonly && Balphaonly && 
	           A.length() >= 1 && A.length() <= 50 &&
	           B.length() >= 1 && B.length() <= 50) {
	        	char[] ACharArray = A.toCharArray();
		        char[] BCharArray = B.toCharArray();
		        
		        Arrays.sort(ACharArray);
		        A = new String(ACharArray);
		        
		        System.out.println("A= " + A);
		        
		        Arrays.parallelSort(BCharArray);
		        B = new String(BCharArray);
		        
		        System.out.println("B= " + B);
		        
		        if (A.compareTo(B) == 0) {
		        	System.out.println("Anagrams");
		        }
		        else {
		        	System.out.println("Not Anagrams");
		        }
	        	
	        }  
	    }
	}
