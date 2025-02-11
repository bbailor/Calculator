//Imports the scanner class.
import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        System.out.println("\nEnter two numbers to be added together.");
        
        //Creates a new instance of the scanner class.
        Scanner input = new Scanner(System.in);

        //Prompts the user to enter two integers and stores them as int values. Uses the nextInt() method.
        System.out.print("\n\nEnter the first integer: ");
        int int1 = input.nextInt();

        System.out.print("\nEnter the second integer: ");
        int int2 = input.nextInt();

        //Adds the integers together and prints the sum.
        System.out.println("\n\nThe sum is " + (int1 + int2) + ".");


        input.close();
    }
}