package hackerrank.algorithms.warmup;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Problem link: https://www.hackerrank.com/challenges/time-conversion
 */
public class TimeConversion {
    public static String timeConversion(String s) {
        String pattern = "([0-9]+):([0-9]+):([0-9]+)([A-Z]+)";
        String result = "";

        String hours = "";
        String minutes = "";
        String seconds = "";
        String period = "";
        int hoursAsNumber = 0;

        Pattern r = Pattern.compile(pattern);

        Matcher matcher = r.matcher(s);
        if (matcher.find() && matcher.groupCount() == 4) {
            hours = matcher.group(1);
            hoursAsNumber = Integer.parseInt(hours);
            minutes = matcher.group(2);
            seconds = matcher.group(3);
            period = matcher.group(4);

            if (period.equals("AM")) {
                if (hoursAsNumber == 12) {
                    hours = "00";
                }
            } else {
                if (hoursAsNumber != 12) {
                    hoursAsNumber += 12;
                    hours = String.valueOf(hoursAsNumber);
                }
            }
        }

        result = hours + ":" + minutes + ":" + seconds;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("12:01:02PM"));
        System.out.println(timeConversion("12:01:02AM"));
    }
}
