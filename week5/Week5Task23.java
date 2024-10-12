import java.util.Scanner;
import java.lang.Math;

public class Week5Task23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r;
        double s;
        double area;

        System.out.print("Enter the length from the center of a pentagon to a vertex: ");
        r = input.nextDouble();

        s = 2 * r * Math.sin(Math.PI / 5);
        area = (5 * s * s) / (4 * Math.tan(Math.PI / 5));

        System.out.printf("The area of the pentagon is: %.2f\n", area);
    }
}