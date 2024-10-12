import java.util.Scanner;

public class Week5Task22 {
    public static void main(String[] args){
        int num;
        char[] aHash = new char[16];
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15): ");
        num = input.nextInt();

        aHash[0] = '0';
        aHash[1] = '1';
        aHash[2] = '2';
        aHash[3] = '3';
        aHash[4] = '4';
        aHash[5] = '5';
        aHash[6] = '6';
        aHash[7] = '7';
        aHash[8] = '8';
        aHash[9] = '9';
        aHash[10] = 'A';
        aHash[11] = 'B';
        aHash[12] = 'C';
        aHash[13] = 'D';
        aHash[14] = 'E';
        aHash[15] = 'F';

        if(num > 15 || num < 0){
            System.out.println(num+" is an invalid input");
        }
        else{
            System.out.println("The hex value is "+aHash[num]);
        }
    }
}
