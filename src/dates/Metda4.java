package dates;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Metda4 {
    public static void main(String[] args) {
        time();

    }
    public static void time(){
        LocalTime timeObject;
        timeObject=LocalTime.now();
        DateTimeFormatter tf;
        tf=DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("current time: "+tf.format(timeObject));

    }
}
