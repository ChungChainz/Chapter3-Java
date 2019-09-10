package assignments;

import java.util.Scanner;

public class MetricConversion {
    public static void main(String[] args)
    {
        double inches;
        double gallons;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter the amount of inches here >>> ");
        inches = inputDevice.nextDouble();

        Scanner inputDevice2 = new Scanner(System.in);
        System.out.print("Enter the amount of gallons here >>> ");
        gallons = inputDevice2.nextDouble();

        inchesToCentimeteres(inches);
        gallonsToLiters(gallons);
    }
    public static void inchesToCentimeteres (double inches)
    {
        final double IN_TO_CM = 2.54;
        double lengthConversion;

        lengthConversion = inches * IN_TO_CM;

        System.out.println(inches + " inches converts to " + lengthConversion + " centimeters.");
    }
    public static void gallonsToLiters(double gallons)
    {
        final double GALLONS_TO_LITERS = 3.7854;
        double liquidConversion;

        liquidConversion = gallons * GALLONS_TO_LITERS;

        System.out.println(gallons + " gallons converts to " + liquidConversion + " liters.");
    }
}
