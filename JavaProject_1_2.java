import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        System.out.printf("%-15s %03d\n", "abc", 4); //formatting I/O
        
         if ((N % 2) != 0 ){
             System.out.println("Odd");     
          }   
          if ((N % 2) == 0) {
              if (N >= 2 && N <= 5){
                  System.out.println("result1");
              }
              else if (N >= 6 && N <= 20){
                  System.out.println("result2");
              }
              else if (N > 20){
                   System.out.println("resukt3");
                   
              }
          }
          int i;
          if (N >= 2 && N <= 20) {
             for (i = 1; i <= 10; i++) {
          	    System.out.printf("%d x %d = %d\n", N, i, N * i);
             }
          }
          //a, b & n = from 0 to n
          int a = 0; 
          int b = 2;
          double n = 10;
          double result = 0;
          double total  = 0;
          for (i = 0; i <= n-1; i++) {
        	  
        	  if ( i == 0) {
        	     result = a + Math.pow(2, i)*b;
        	  }
        	  else {
        		  result = Math.pow(2, i)*b;
        	  }
        	  total  = total + result;
        	  System.out.printf("%.0f ", total);
        	  
          }
          System.out.printf("%f", Math.pow(2,32));
          System.out.printf("%f", Math.pow(2,63));
    }
      //   scanner.close();
      
    
}

