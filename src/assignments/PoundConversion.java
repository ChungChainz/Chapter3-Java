package assignments;

import java.util.Scanner;

public class PoundConversion {
    public static void main(String [] args)
    {
        double userEntry;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of lbs. here >>> ");
        userEntry = input.nextDouble();
        calculateKilograms(userEntry);
        calculateOunces(userEntry);
        calculateMilligrams(userEntry);

    }
    public static void calculateKilograms(double num1)
    {
        double total;
        final double LBS_TO_KG = 0.453592;
        total = num1 * LBS_TO_KG;
        System.out.println(num1 + " lbs converts to " + total + " kg.");
    }
    public static void calculateOunces(double num1)
    {
        double total;
        final double LBS_TO_OZ = 16;
        total = num1 * LBS_TO_OZ;
        System.out.println(num1 + " lbs converts to " + total + " oz.");
    }
    public static void calculateMilligrams(double num1)
    {
        double total;
        final double LBS_TO_MG = 453592;
        total = num1 * LBS_TO_MG;
        System.out.println(num1 + " lbs converts to " + total + " mg.");
    }

}
