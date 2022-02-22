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
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();      
        
        // Write your code here
        
        if (payment >= 0 && payment <= Math.pow(10,9)){
           NumberFormat currencyFormatter = 
                NumberFormat.getCurrencyInstance(Locale.US);
           String us = currencyFormatter.format(payment);
           System.out.println("US: " + us);
        
           NumberFormat currencyFormatter1 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
           String india = currencyFormatter1.format(payment);
           System.out.println("India: " + india);
        
           NumberFormat currencyFormatter2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
           String china = currencyFormatter2.format(payment);
           System.out.println("China: " + china);
        
           NumberFormat currencyFormatter3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
           String france = currencyFormatter3.format(payment);
           System.out.println("France: " + france);
        }
        
        
    }
}
