package assignments;

import java.util.Scanner;

public class NumbersDemo2 {
    public static void main(String[] args)
    {
        int x;
        int y;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter one integer here >>> ");
        x = inputDevice.nextInt();

        Scanner inputDevice2 = new Scanner(System.in);
        System.out.print("Enter another integer here >>> ");
        y = inputDevice2.nextInt();

        displayTwiceTheNumber(x, y);
        displayNumberPlusFive(x, y);
        displayNumberSquared(x, y);

    }
    public static void displayTwiceTheNumber(int x, int y)
    {
        int x2;
        int y2;

        x2 = x * 2;
        y2 = y * 2;

        System.out.println(x2 + " " + y2);
    }
    public static void displayNumberPlusFive (int x, int y)
    {
        int x2;
        int y2;

        x2 = x + 5;
        y2 = y + 5;

        System.out.println(x2 + " " + y2);
    }
    public static void displayNumberSquared (int x, int y)
    {
        int x2;
        int y2;

        x2 = x * x;
        y2 = y  * y;

        System.out.println(x2 + " " + y2);
    }
}
