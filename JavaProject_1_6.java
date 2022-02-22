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


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        if (A.compareTo(B) > 0){
            System.out.println("Yes");
        }
        else {
        	System.out.println("No");
        }
        String firstLetter = A.substring(0,1);
        String restOfString = A.substring(1, A.length());
        System.out.print(firstLetter.toUpperCase() + restOfString);
        
        firstLetter = B.substring(0,1);
        restOfString = B.substring(1, B.length());
        System.out.println(" " + firstLetter.toUpperCase() + restOfString);
        
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        boolean alphaonly;
        

        System.out.println("Input String " + S);
        
        String smallestStr = "";
        String largestStr = "";
        String newString = "";
        smallestStr = S.substring(0,3);
        largestStr  = smallestStr;
        for (int i = 1; i <= S.length() - 1; i++) {
        	 //firstStr = S.substring(i, 3);
        	 newString  = S.substring(i, 3);
        	 if (newString.compareTo(smallestStr) < 0) {
        		smallestStr = newString;
        	 }
        	 if (newString.compareTo(largestStr) > 0) {
        		largestStr = newString;
        	 }
        }
        System.out.println("smallest " + smallestStr);
        System.out.println("largest " + largestStr);
        
                
        
        //alphaonly = S.chars().allMatch(Character::isLetter);
        alphaonly = Pattern.matches("[A-Za-z]+", S);
        
        if ((S.length() >= 1 && S.length() <= 100) &&
            (start >= 0 && start < end && end <= 100 ) &&
            alphaonly) {
            System.out.println(S.substring(start, end - 1));
        }

        
    }
}


