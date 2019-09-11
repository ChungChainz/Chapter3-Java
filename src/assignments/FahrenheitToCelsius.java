package assignments;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args)
    {
        double temp;
        int i = 1;

        while (i < 4)
        {
            if(i == 1)
            {
                Scanner inputDevice = new Scanner(System.in);
                System.out.print("Enter the 8 am temperature in F here >>> ");
                temp = inputDevice.nextDouble();

                displayConversion(temp);
                i++;
            }
            else if (i == 2)
            {
                Scanner inputDevice = new Scanner(System.in);
                System.out.print("Enter the noon temperature in F here >>> ");
                temp = inputDevice.nextDouble();

                displayConversion(temp);
                i++;
            }
            else
            {
                Scanner inputDevice = new Scanner(System.in);
                System.out.print("Enter the 5 pm temperature in F here >>> ");
                temp = inputDevice.nextDouble();

                displayConversion(temp);
                i++;
            }
        }
    }
    public static void displayConversion(double temp)
    {
        double celsius = (temp - 32) * 5/9;

        if (celsius <= 0) {
                System.out.println("It is " + temp + " degrees F. " + "\nIt is " + celsius + " degrees C." +
                        " \nIt was FREEZING!");
        }
            else if (celsius >= 37.7778) {
                System.out.println("It is " + temp + " degrees F. " + "\nIt is " + celsius + " degrees C." +
                        " \nIt was VERY HOT!");
            }
            else {
                System.out.println("It is " + temp + " degrees F. " + "\nIt is " + celsius + " degrees C.");
            }
    }
}
