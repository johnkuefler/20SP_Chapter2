
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jkuefler
 */
public class StringManipulator {

    public static void main(String[] args) {
        // print to console asking user to enter favorite city
        System.out.println("Please enter your favorite city");

        // Get "city" variable from user as a string
        Scanner keyboard = new Scanner(System.in);
        String city = keyboard.nextLine();

        // get number of characters in city name, store to a numeric variable charactersInName
        int charactersInName = city.length();

        // display character in name to the user
        System.out.println("Number of characters: " + charactersInName);

        // get name of city in all uppercase letters, store to a string variable named cityUppercase
        String cityUppercase = city.toUpperCase();

        // display cityUppercase to the user
        System.out.println("Uppercase: " + cityUppercase);

        // get name of city in all lowercase letters, store to a string variable named cityLowercase
        String cityLowercase = city.toLowerCase();

        // display cityLowercase to the user
        System.out.println("Lowercase: " + cityLowercase);

        // get first character of the name of city to a char variable named firstCharacter
        char firstCharacter = city.charAt(0);

        // display firstCharacter to the user
        System.out.println("First character: " + firstCharacter);
    }
}
