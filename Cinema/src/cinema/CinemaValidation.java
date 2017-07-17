/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

/**
 *
 * @author Hassan12
 */
public class CinemaValidation {
    
    public static boolean isDayEnteredValid(String day) {
        if ((day.equalsIgnoreCase("Monday")) || 
                (day.equalsIgnoreCase("Tuesday")) || 
                (day.equalsIgnoreCase("Wednesday")) ||
                (day.equalsIgnoreCase("Thursday")) ||
                (day.equalsIgnoreCase("Friday")) ||
                (day.equalsIgnoreCase("Saturday")) ||
                (day.equalsIgnoreCase("Sunday"))) {
            return true;
        } else {
        return false;
        }
    }
}
