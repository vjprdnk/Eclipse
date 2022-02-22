import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {

	private static final Scanner scanner = new Scanner(System.in);
    public static int B, H;
    public static boolean flag;
    
    public static boolean validateInput(int B1, int H1) {
    	if (B1 <= 0 || H1 <= 0) {
    		System.out.println("java.lang.Exception: Breadth and height must be positive");
    		return(false);
    	}
    	else if (B1 > 100 || H1 > 100){
    		return(false);
    	}
    	else return(true);
    }

    public static void main(String[] args){
    	    B = scanner.nextInt();
    	    H = scanner.nextInt();
   // 		if(flag){
    	    if(validateInput(B, H)){
    			int area=B*H;
    			System.out.print(area);
    		}     
    }
}

