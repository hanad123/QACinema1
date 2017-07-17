/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import java.util.InputMismatchException;

/**
 *
 * @author Hassan12
 */
public class MenuInterfaceImpl extends MenuInterface{

   
    private CinemaPriceCalculatorImpl cinemaPriceCalculator = new CinemaPriceCalculatorImpl();
    public MenuInterfaceImpl() {
        while (true) {
            displayMenu();
        }
    }

    private void displayMenu() {
        System.out.print("Welcome to the cinema, please enter day you want to watch the movie: ");
        String day = super.getInput();
        int adult, child, oap, student;

        if (!CinemaValidation.isDayEnteredValid(day)) {
            System.err.println("Invalid day entered, please enter either Monday, Tuesday, Wednesday, Thursday, Friday, Saturday or Sunday");
            return;
        }
        try {
            System.out.print("Please enter number of adult tickets: ");
            adult = (Integer.parseInt(super.getInput()));
        } catch (InputMismatchException e) {
            System.err.println("Error: Only numeric values accepted");
            return;
        }

        try {
            System.out.print("Please enter number of OAP tickets: ");
            oap = (Integer.parseInt(super.getInput()));
        } catch (InputMismatchException e) {
            System.err.println("Error: Only numeric values accepted");
            return;
        }
        
        try {
            System.out.print("Please enter number of child tickets: ");
            child = (Integer.parseInt(super.getInput()));
        } catch (InputMismatchException e) {
            System.err.println("Error: Only numeric values accepted");
            return;
        }
        
        try {
            System.out.print("Please enter number of student tickets: ");
            student = (Integer.parseInt(super.getInput()));
        } catch (InputMismatchException e) {
            System.err.println("Error: Only numeric values accepted");
            return;
        }
        
        System.out.println(cinemaPriceCalculator.calculateAnyDiscount(day, adult, oap, student, child));
    }

}
