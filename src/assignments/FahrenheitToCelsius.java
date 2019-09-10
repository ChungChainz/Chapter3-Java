package assignments;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args)
    {
        double morningTemp;
        double noonTemp;
        double eveningTemp;

        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter the 8am temperature in F here >>> ");
        morningTemp = inputDevice.nextDouble();

        Scanner inputDevice2 = new Scanner(System.in);
        System.out.print("Enter the 12pm temperature in F here >>> ");
        noonTemp = inputDevice2.nextDouble();
    }
}
