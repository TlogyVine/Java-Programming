public class Main {
    public static void main(String[] args) {
        double k = 14;
        double mile = k/1.6;

        int m = 45;
        int s = 30 + m*60;
        double h_1 = s*1.0/3600;

        double average = mile*h_1;
        System.out.println(average);
    }
}