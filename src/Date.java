package src;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String args[]){
        LocalDateTime time = LocalDateTime.now();   //  Get the current date/time
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  //  Format the date/time
        String formattedTime = time.format(format); //  Apply the format
        System.out.println(formattedTime);  //  Print out the format
    }
}
