import java.util.Scanner;

public class Lab2Task18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = input.nextInt();

        boolean isLeapYear = (year%4 == 0 && year %100!= 0) || (year %400 == 0);
        if(isLeapYear){
            System.out.println("Is a leap year");
        }
        else{
            System.out.println("Is not a leap year");
        }
    }
}