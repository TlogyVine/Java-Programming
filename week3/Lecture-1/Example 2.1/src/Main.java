import java.util.Scanner;

import static java.lang.Math.atan;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        final double PI = 4*atan(1);  // high-precision
        double area = radius*radius*PI;
        double volume = area*length;

        System.out.println("The area is "+area);
        System.out.println("The volume is "+volume);
    }
}