public class Main {
    public static void main(String[] args) {
        double rate = 0.05 / 12;

        double first = 100*(1+rate);
        double second = (first+100)*(1+rate);
        double third = (second+100)*(1+rate);
        System.out.println("total: "+ third);
    }
}