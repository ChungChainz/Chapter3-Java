package assignments;

public class Percentages {
    public static void main(String[] args)
    {
        double x = 5;
        double y = 2;
        computePercent(x, y);
    }
    public static void computePercent(double x, double y)
    {
        double x2;
        double y2;

        x2 = (x/y) * 100;
        y2 = (y/x) * 100;

        System.out.println(x2 + "% and " + y2 + "%");
    }
}
