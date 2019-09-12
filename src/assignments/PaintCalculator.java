package assignments;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;

public class PaintCalculator {
    public static void main(String[] args) {
        double length;
        double width;
        double height;

        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter the length of the room here (feet) >>> ");
        length = inputDevice.nextDouble();

        Scanner inputDevice2 = new Scanner(System.in);
        System.out.print("Enter the width of the room here (feet) >>> ");
        width = inputDevice2.nextDouble();

        Scanner inputDevice3 = new Scanner(System.in);
        System.out.print("Enter the height of the room here (feet) >>> ");
        height = inputDevice3.nextDouble();

        wallArea(length, width, height);
    }

    public static void wallArea(double length, double width, double height) {
        double paintedArea = (height * width) * 2 + (height * length) * 2;

        numGallons(paintedArea);
    }

    public static void numGallons(double paintedArea) {
        final double ONE_GALLON_OF_PAINT = 350;
        double amountOfPaint;

        amountOfPaint = paintedArea / ONE_GALLON_OF_PAINT;

        System.out.println(Math.ceil(amountOfPaint) + " gallons is needed to cover the room.");
        priceTotalGallons(amountOfPaint);
    }

    public static void priceTotalGallons(double amountOfPaint) {
        final double PRICE_OF_PAINT = 32;
        double finalPrice;

        finalPrice = amountOfPaint * PRICE_OF_PAINT;

        DecimalFormat df2 = new DecimalFormat("#.##");
        df2.setRoundingMode(RoundingMode.CEILING);
        for (Number n : Arrays.asList(finalPrice)) {
            Double d = n.doubleValue();
            System.out.println("The cost to paint the room will be $" + df2.format(d) + ".");

        }

    }
}