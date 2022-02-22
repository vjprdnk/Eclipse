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

/*class Result {

    

} */

public class Main {
    
    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
       String dayOfWeekString = ""; 
       if (year > 1000 && year < 3000){
    	   /*
           Calendar cal1 = GregorianCalendar.getInstance();
           Calendar cal2 = new Calendar.Builder().setDate(year, month, day).build();
           System.out.println("cal1 before setting " + cal1.get(Calendar.DAY_OF_WEEK));
           cal1.set(year, month, day);
          
           //cal1.getTime();
           //System.out.println("enum day of week " + Calendar.DAY_OF_WEEK);
           //System.out.println("calendar cal1 after setting " + cal1.get(Calendar.DAY_OF_WEEK));
           System.out.println("calendar cal2 after setting" + cal2);
           System.out.println("enum day of week " + cal1.get(Calendar.DAY_OF_WEEK));
           */
           String day_of_week_text = "";
           LocalDate date;
           DayOfWeek dotw;
           
           switch(month) {
           case 1:
        	   //dotw = LocalDate.of(year, Month.JANUARY, day).getDayOfWeek();
        	   dayOfWeekString = LocalDate.of(year, Month.AUGUST, day).getDayOfWeek().getDisplayName(java.time.format.TextStyle.FULL, Locale.US);
        	   
           case 8:
        	   //date = LocalDate.of(year, Month.AUGUST, day);
        	   //dotw = LocalDate.of(year, Month.AUGUST, day).getDayOfWeek();
        	   dayOfWeekString = LocalDate.of(year, Month.AUGUST, day).getDayOfWeek().getDisplayName(java.time.format.TextStyle.FULL, Locale.US);
           default:
        	   break;
           }
           
          
           
           //LocalDate date = LocalDate.of(year, Month.NOVEMBER, 20);
           //DayOfWeek dotw = LocalDate.of(2012, Month.JULY, 9).getDayOfWeek();
           /*
           switch(cal1.get(Calendar.DAY_OF_WEEK)){
               case 1: 
                    dayOfWeekString = "MONDAY";
                    break;
               case 2: 
                    dayOfWeekString = "TUESDAY";
                    break;
               case 3: 
                    dayOfWeekString = "WEDNESDAY";
                    break;
               case 4: 
                    dayOfWeekString = "THURSDAY";
                    break;
               case 5: 
                    dayOfWeekString = "FRIDAY";
                    break;
               case 6: 
                    dayOfWeekString = "SATURDAY";
                    break;
               case 7: 
                    dayOfWeekString = "SUNDAY";
                    break;
               default:
                    break;
           }
           */
           
       }
      
       return(dayOfWeekString.toUpperCase());
       
      // return(UPPER(day_of_week_text));

    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        //String res = Result.findDay(month, day, year);
        String res = findDay(month, day, year);

        System.out.println("y" + year);
        System.out.println("m" + month);
        System.out.println("d" + day);
        
        System.out.println("res" + res);
        
      //  bufferedWriter.write(res);
      //  bufferedWriter.newLine();

        bufferedReader.close();
      //  bufferedWriter.close();
    }
}
