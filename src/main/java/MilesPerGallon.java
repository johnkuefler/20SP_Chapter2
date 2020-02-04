
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class MilesPerGallon {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        // prompt user for number of miles
        System.out.println("Please enter miles driven");
        
        // get number of miles driven as a double
        double milesDriven = keyboard.nextDouble();
        
        // prompt user for gallons of gas
        System.out.println("Please enter gallons of gas");
        
        // get gallons of gas used as a double
        double gallonsOfGas = keyboard.nextDouble();
        
        // set a MPG variable as a double 	
        // MPG = Miles driven/Gallons of gas used
        double milesPerGallon = milesDriven/gallonsOfGas;
        
        // display the MPG variable to screen
        //JOptionPane.showMessageDialog(null, "Your miles per gallon was: " + milesPerGallon);
    
        System.out.println("Your miles per gallon was: " + milesPerGallon);
    }
    
}
