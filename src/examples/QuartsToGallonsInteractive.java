package examples;

import java.util.Scanner;

public class QuartsToGallonsInteractive {

    public static void main(String[] args){
        int numQuarts;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of quarts your have >>> ");
        numQuarts = keyboard.nextInt();
        calculateToGallons(numQuarts);
    }
    public static void calculateToGallons(int numQuarts){
        int numGallons;
        int quartsRemaining;
        final int NUM_QUARTS_IN_GALLON = 4;

        numGallons = numQuarts / NUM_QUARTS_IN_GALLON;

        quartsRemaining = numQuarts % NUM_QUARTS_IN_GALLON;
        System.out.println("The number of gallons is " + numGallons + " with " +
                quartsRemaining + " quarts remaining.");

    }
}
