
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        
        String firstNum = JOptionPane.showInputDialog("Please input first number");
        String secondNum = JOptionPane.showInputDialog("Please input second number");

        int result = Integer.parseInt(firstNum) * Integer.parseInt(secondNum);
        
        
          
        
        System.out.println("Please enter first number");
        int firstNumber = keyboard.nextInt();
        System.out.println("Please enter second number");
        int secondNumber = keyboard.nextInt();

        int sumOfNumbers = firstNumber + secondNumber;

        System.out.println("Sum is: " + sumOfNumbers);

        
        
        
        
        
        
        //System.out.println("Please enter your name");

        String usersName = JOptionPane.showInputDialog("Please enter your name");
        //String usersName = keyboard.nextLine();
        
        //System.out.println("Hello " + usersName);
        JOptionPane.showMessageDialog(null,"Hello " + usersName);
        
      
        
        
        System.out.println("Class1:\t \"Intermediate Programming\"");
        System.out.println("Class2:\t Systems Analysis");

        String outputText = "This will not \n";

        System.out.print(outputText + " Be printed on one line " + 1000);

        System.out.println("Hello there"
                + "how are you"
                + "etc");

        int inches = 12;
        double temperatureInF = 10.5;
        byte myNumber;
        myNumber = 2;

        boolean itsWarmOut = false;

        char firstLetterOfMyFirstName = 'J';
        String firstLetterOfMyLastName = "K";

        int month, days;
        month = 2;
        days = 28;
        System.out.println("Month " + month + " has "
                + days + " Days.");

        int sum = 5 + 4; // sum = 9

        sum = sum + 3; // sum = 12
        sum += 3; // sum = 12

        final double PI = 3.14;
        //pi = 2; not allowed!

        final double KANSAS_SALES_TAX = 0.095;

        String myName = "John";
        int myNameLength = myName.length();
    }

}
