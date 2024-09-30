import java.util.Scanner;

public class Lab2Task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your pay: ");
        double pay = input.nextDouble();
        System.out.println("Your pay without increment is: " + pay);

        System.out.print("Enter your score: ");
        double score = input.nextDouble();

        double rate = 0;
        if (score > 90) rate = 0.03;
        else rate = 0.01;

        double new_pay = pay + (pay * rate);
        System.out.println("Your pay with increment is: " + new_pay);
    }
}
