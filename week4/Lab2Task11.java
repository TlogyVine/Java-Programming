import java.util.Scanner;

public class Lab2Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter purchase amount: ");
        double purchaseAmount = scanner.nextDouble();
        double tax = purchaseAmount * 0.06;
        
        System.out.printf("Sales tax is $%.2f%n", tax);
    }
}
