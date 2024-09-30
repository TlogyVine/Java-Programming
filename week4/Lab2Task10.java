import java.util.Scanner;

public class Lab2Task10 {
    public static void main(String[] args) {
        double money;
        double rate = 0.05/12;

        System.out.print("Enter the Monthly saving amount: ");
        Scanner input = new Scanner(System.in);
        money = input.nextDouble();

        double sum = 0;
        for(int i=0; i<6; i++){
            sum = (money+sum)*(1+rate);
        }

        System.out.printf("After the sixth month, the account value is $%.2f\n", sum);
    }
}
