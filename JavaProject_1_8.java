import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
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
        
    	        
        Scanner in = new Scanner(System.in);
        String S = in.next();  
        int k    = in.nextInt();

        System.out.println("Input String " + S);
        
        String smallestStr = "";
        String largestStr = "";
        String newString = "";
        boolean alphaonly;
        
        
     
        
      //alphaonly = S.chars().allMatch(Character::isLetter);
        alphaonly = Pattern.matches("[A-Za-z]+", S);
                
      String S1 = new StringBuilder(S).reverse().toString();
      
      System.out.println("Input String 1 " + S1);
      
      if (S.length() >= 1 && S.length() <= 1000 && alphaonly) {
        	smallestStr = S.substring(0,k);
            largestStr  = smallestStr;
            
            for (int i = 1; i <= S.length() - k; i++) {
        	    newString  = S.substring(i, i+k);
        	
           	    if (newString.length() == k) {
        	       if (newString.compareTo(smallestStr) < 0) {
        		      smallestStr = newString;
        	       }
        	       if (newString.compareTo(largestStr) > 0) {
        		      largestStr = newString;
        	       }
        	    }
            }
            System.out.println("smallest " + smallestStr);
            System.out.println("largest " + largestStr);
        }
        
    
    }
}
