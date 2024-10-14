import javax.swing.*;
import java.util.Scanner;

public class Lab6Task3 {
    public static boolean check(int num, int target){
        if(num > target){
            System.out.println("Your guess is too high");
            return false;
        }
        if(num < target){
            System.out.println("Your guess is too low");
            return false;
        }
        System.out.println("Yes, the number is "+target);
        return true;
    }
    public static void main(String[] args){
        int num = (int)(Math.random() * 1000)%101;
        Scanner input = new Scanner(System.in);

        System.out.println("Guess a magic number between 0 and 100");
        System.out.print("Enter your guess: ");
        int ans = input.nextInt();
        while(!check(ans, num)){
            System.out.print("Enter your guess: ");
            ans = input.nextInt();
        }
    }
}
