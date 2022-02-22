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
	        /* Enter your code here. Print output to STDOUT. */
	        Character ch;
	        boolean  lowercase = true;
	        	        
	        for (int i = 0; i <= A.length() - 1 && lowercase; i++){
	            ch = A.charAt(i);
	            lowercase = Character.isLowerCase(ch);
	        }
	               
	        
	        if (lowercase && A.length() <= 50){
	          String B = new StringBuilder(A).reverse().toString();
	          
	          System.out.println("B =" + new StringBuilder(A).reverse());
	          
	          if (A.compareTo(B) == 0){
	             System.out.println("Yes");
	          }
	          else {
	             System.out.println("No");
	          }
	        }
	        
	    }
	}
