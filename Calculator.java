//Imports the scanner class.
import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        System.out.println("\nEnter two numbers to add or subtract.");
        
        //Creates a new instance of the scanner class.
        Scanner input = new Scanner(System.in);

        //Prompts the user to enter two integers and stores them as int values. Uses the nextInt() method.
        System.out.print("\n\nEnter the first integer: ");
        int int1 = input.nextInt();

        System.out.print("\nEnter the second integer: ");
        int int2 = input.nextInt();

        //Prompts the user to enter an operation. Stores the value as an integer that corresponds to an operation.
        System.out.print("\nEnter \"1\" to add the integers, or enter \"2\" to subtract: ");
        int operation = input.nextInt();

        //Switch statement to perform the correct operation.
        //Default block accounts for invalid entry.
        switch (operation)
        {
            case 1:
                System.out.println("\n\nThe sum is " + (int1 + int2) + ".");
                break;
            case 2:
                System.out.println("\n\nThe difference is " + (int1 - int2) + ".");
                break;
            default:
                System.out.println("\n\nAn invalid operation was entered.");
        }

        input.close();
    }
}