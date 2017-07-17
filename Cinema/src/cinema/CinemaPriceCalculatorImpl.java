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
public class CinemaPriceCalculatorImpl extends CinemaPriceCalculator{
    private double standard = 8;
    private double oap = 6;
    private double student = 6;
    private double child = 4;
   
    
    public String calculateAnyDiscount(String day, int standard, int oap, int student, int child) {
        double total = 0;
        if (day.equalsIgnoreCase("Wednesday")) {
            standard -= 2;
            oap -= 2;
            student -= 2;
            child -= 2;
        }
        total += (standard * this.standard);
        total += (oap * this.oap);
        total += (student * this.student);
        total += (child * this.child);
        return "The total cost of ticket for this movie is " + total;
    }
    
}
