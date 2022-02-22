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
import java.util.Scanner;
import java.lang.Object;
//import javax.swing.text.html.parser.*;

public class Main {

    public static void main(String[] args) {     
  
    	 
        Scanner in = new Scanner(System.in);
                
        int numSentences = Integer.parseInt(in.nextLine());
        int starttag1 = 0, starttag2 = 0, endtag1 = 0, endtag2 = 0, endtag11 = 0;
        String starttagname = "", restOfInput = "", endtagname = "";
        boolean starttagfound = false;
       
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            starttagfound = false;
            //  find <..> & </..>  and extract string between two tags
            //
         //   System.out.println("numSentences " + numSentences);
            
            starttag1      = input.indexOf('<');
            starttag2      = input.indexOf('>');   
            starttagname   = input.substring(starttag1 + 1, starttag2);
            
            int endtag0 = input.indexOf("</");
            
          //  System.out.println(input.substring(starttag2 + 1, endtag0));
            
          //  System.out.println(input.substring(starttag2 + 1, endtag0).indexOf('<'));
            
          //  System.out.println("starttagfound " + starttagfound);
            
            int cnt = 0;
            restOfInput      = input.substring(starttag2 + 1);
            System.out.println("restOfInput before while " + restOfInput);
           
            while (!starttagfound) {
          	   System.out.println("inside while");
          	   
               if (restOfInput.substring(0, restOfInput.indexOf("</") - 1).indexOf('<') >= 0) {
            	   starttagfound  = false;
            	   
            	   System.out.println("while if ");
            	   
            	
            	   
            	   starttag1      = input.indexOf('<');
                   starttag2      = restOfInput.indexOf('>');   
                   endtag0        = restOfInput.indexOf("</");
                   starttagname     = restOfInput.substring(starttag1 + 1, starttag2);
                   
                System.out.println("while restofinput " + restOfInput);
              //     System.out.println(starttag1 + " " + starttag2);
              //     System.out.println(restOfInput.substring(starttag2 + 1));
                   
                   restOfInput = restOfInput.substring(starttag2 + 1);
                //   starttagname     = restOfInput.substring(starttag1 + 1, starttag2);
                   
                //   cnt++;
                  
                 /*  if (cnt > 2) {
                	   break;
                   }*/
               }
               else {
            	   starttagfound  = true;
               } 
            }
            cnt = 0;
            
           
          //  restOfInput      = input.substring(starttag2 + 1);
            
           System.out.println("restOfInput " + restOfInput);
            
            System.out.println("starttagname " + starttagname);
            
            if (starttagname.compareTo("<") != 0 &&
            	starttagname.compareTo(">") != 0) {
            	
            	
            	endtag1 = restOfInput.indexOf("</");
                endtag2 = restOfInput.indexOf('>');
                
                
                
               // endtag1 = input.indexOf("</");
              //  endtag2 = ((endtag1 + 2) - (starttag2 + 1)) + 
              //  		  input.substring(endtag1 + 2, input.length()).indexOf('>');
                
            System.out.println("endtag1 = " + endtag1 + "endtag2 = " + endtag2);
                
                endtagname = restOfInput.substring(endtag1 + 2, endtag2);
                
          //      System.out.println("endtagname = " + endtagname);
                
          //      System.out.println("content = " + input.substring(starttag2 + 1, input.indexOf("</")));
                
                endtag11 = input.indexOf("</");
                
                //String contentstr = input.substring(starttag2 + 1, endtag1 - 1);
                
                //System.out.println("contentstr = " + contentstr);
                
                //endtagname  = input.substring(contentstr.length() + 2, endtag11);
                
               // System.out.println("endtagname " + endtagname);
                
                if (endtagname.compareTo("") != 0 && 
                	starttagname.compareTo(endtagname) == 0) {
                //	System.out.println("Result = " + input.substring(starttag2 + 1, endtag11));
                	System.out.println("Result = " + restOfInput.substring(starttag1, endtag1));
                	
                }
                else {
                	System.out.println("Result = " + "None");
                }
            	
            }
            else {
            	System.out.println("None");
            }
            
        }
        
        in.close();	       	        
    }
}

