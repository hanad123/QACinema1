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
public abstract class CinemaPriceCalculator {
    
    public abstract String calculateAnyDiscount(String day, int standard, int oap, int student, int child);
    
}
