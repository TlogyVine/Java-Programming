import static java.lang.Math.atan;

public class Main {
    public static void main(String[] args) {
        double pi = 4*atan(1);

        double radius = 5.5;
        double perimeter = radius*2*pi;
        double area = radius*radius*pi;
        System.out.println(perimeter);
        System.out.println(area);
    }
}