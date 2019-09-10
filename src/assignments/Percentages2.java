package assignments;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import java.util.Arrays;
import java.util.Scanner;

public class Percentages2 {

    public static void main(String[] args)
    {
       double x;
       double y;

        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter one number here >>> ");
        x = inputDevice.nextDouble();

        Scanner inputDevice2 = new Scanner(System.in);
        System.out.print("Enter another number here >>> ");
        y = inputDevice2.nextDouble();

        computePercent(x, y);
    }
    public static void computePercent(double x, double y)
    {
        double x2;
        double y2;


        x2 = (x/y) * 100;
        y2 = (y/x) * 100;

        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        for (Number n : Arrays.asList(x2)) {
            Double d = n.doubleValue();
            System.out.println(x + "/" + y + " = " + df.format(d) + "%");
        }
        DecimalFormat df2 = new DecimalFormat("#.##");
        df2.setRoundingMode(RoundingMode.CEILING);
        for (Number n : Arrays.asList(y2)) {
            Double d = n.doubleValue();
            System.out.println(y + "/" + x + " = " + df.format(d) + "%");
        }

    }
}
