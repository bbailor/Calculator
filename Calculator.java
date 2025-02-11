//Imports the scanner class.
import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        System.out.println("\nEnter two real numbers (decimal values supported) to add, subtract, multiply, or divide.");
        
        //Creates a new instance of the scanner class.
        Scanner input = new Scanner(System.in);

        //Prompts the user to enter two numbers and stores them as double values. Uses the nextDouble() method.
        System.out.print("\n\nEnter the first integer: ");
        double num1 = input.nextDouble();

        System.out.print("\nEnter the second integer: ");
        double num2 = input.nextDouble();

        //Prompts the user to enter an operation. Stores the value as an integer that corresponds to an operation.
        System.out.print("\nEnter \"1\" to add the integers, enter \"2\" to subtract, , enter \"3\" to multiply, or enter \"4\" to divide: ");
        int operation = input.nextInt();

        //Switch statement to perform the correct operation.
        //Default block accounts for invalid entry.
        switch (operation)
        {
            case 1:
                System.out.println("\n\nThe sum is " + (num1 + num2) + ".");
                break;
            case 2:
                System.out.println("\n\nThe difference is " + (num1 - num2) + ".");
                break;
            case 3:
                System.out.println("\n\nThe product is " + (num1 * num2) + ".");
                break;
            case 4:
                System.out.println("\n\nThe quotient is " + (num1 / num2) + ".");
                break;
            default:
                System.out.println("\n\nAn invalid operation was entered.");
        }

        input.close();
    }
}