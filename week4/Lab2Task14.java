import java.util.Scanner;

public class Lab2Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double POUND_TO_KILOGRAM = 0.45359237;
        final double INCH_TO_METER = 0.0254;

        System.out.print("Enter weight in pounds: ");
        double weightPounds = scanner.nextDouble();
        System.out.print("Enter height in inches: ");
        double heightInches = scanner.nextDouble();
        double weightKilograms = weightPounds * POUND_TO_KILOGRAM;
        double heightMeters = heightInches * INCH_TO_METER;
        double bmi = weightKilograms / (heightMeters * heightMeters);
        System.out.println("BMI is " + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Normal");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
