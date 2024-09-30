import java.util.Scanner;

public class Main {
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

        System.out.print("After the sixth month, the account value is $");
        System.out.println(sum);
    }
}