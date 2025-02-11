import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        System.out.println("\nEnter two numbers to be added together.");
        
        Scanner input = new Scanner(System.in);

        System.out.print("\n\nEnter the first integer: ");
        int int1 = input.nextInt();

        System.out.print("\nEnter the second integer: ");
        int int2 = input.nextInt();

        System.out.println("\n\nThe sum is " + (int1 + int2) + ".");
        input.close();
    }
}