
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class TestAverage {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        // prompt user for test score 1
        System.out.println("Please enter test score 1");
        
        // set a variable called score1 as a double from user input
        double score1= keyboard.nextDouble();
        
        // prompt user for test score 2
        System.out.println("Please enter test score 2");
        
        // set a variable called score2 as a double from user input
        double score2= keyboard.nextDouble();

        
        // prompt user for test score 3
        System.out.println("Please enter test score 3");

        // set a variable called score3 as a double from user input
        double score3= keyboard.nextDouble();

        
        // display test scores 1,2,3 to the user
        System.out.println("Score 1:\t"+score1+
                "\nScore 2:\t" + score2 +
                "\nScore 3:\t" + score3);
        
        // calculate average of score 1,2,3 into a average variable of type double
        double average = (score1+score2+score3)/3;
        
        // display average to user
        System.out.println("Average is " + average);        
        
    }
}
