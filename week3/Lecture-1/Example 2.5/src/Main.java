import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of side: ");
        double sideLength = input.nextDouble();
        double area = (3 * Math.sqrt(3) / 2) * Math.pow(sideLength, 2);

        System.out.println("The area of the hexagon is: " + area);
    }
}