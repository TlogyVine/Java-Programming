import java.util.Scanner;

public class Week5Task25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String city1, city2, city3, temp;

        System.out.print("Enter the first city: ");
        city1 = input.nextLine();
        System.out.print("Enter the second city: ");
        city2 = input.nextLine();
        System.out.print("Enter the third city: ");
        city3 = input.nextLine();

        if (city1.compareTo(city2) > 0) {
            temp = city1;
            city1 = city2;
            city2 = temp;
        }
        if (city1.compareTo(city3) > 0) {
            temp = city1;
            city1 = city3;
            city3 = temp;
        }
        if (city2.compareTo(city3) > 0) {
            temp = city2;
            city2 = city3;
            city3 = temp;
        }

        System.out.print("The three cities in alphabetical order are");
        System.out.print(" "+city1);
        System.out.print(" "+city2);
        System.out.print(" "+city3);
    }
}