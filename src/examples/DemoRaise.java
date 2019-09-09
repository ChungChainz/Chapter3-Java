package examples;

import java.util.Scanner;

public class DemoRaise
{
    public static void main(String[] args)
    {
        double salary;
        double startingWage = 800.00;

        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter your salary here >>> ");
        salary = inputDevice.nextDouble();

       pl("Demonstrating some raises:");
        predictRaise(salary);
        predictRaise(startingWage);
    }
    public static void predictRaise(double salary)
    {
        double newSalary;
        final double RAISE_RATE = 1.10;
        newSalary = salary * RAISE_RATE;

        pl("Current salary: $" + salary + "\nAfter raise: $" + newSalary);
    }
    public static void pl(String p)
    {
        System.out.println(p);
    }
}
