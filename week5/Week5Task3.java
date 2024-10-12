public class Week5Task3 {
    public static void main(String[] args) {

        System.out.println(Math.ceil(2.1)); // returns 3.0
        System.out.println(Math.ceil(2.0)); // returns 2.0
        System.out.println(Math.ceil(-2.0)); // returns -2.0
        System.out.println(Math.ceil(-2.1)); // returns -2.0

        System.out.println(Math.floor(2.1)); // returns 2.0
        System.out.println(Math.floor(2.0)); // returns 2.0
        System.out.println(Math.floor(-2.0)); // returns -2.0
        System.out.println(Math.floor(-2.1)); // returns -3.0

        System.out.println(Math.rint(2.1)); // returns 2.0
        System.out.println(Math.rint(-2.0)); // returns -2.0
        System.out.println(Math.rint(-2.1)); // returns -2.0
        System.out.println(Math.rint(2.5)); // returns 2.0
        System.out.println(Math.rint(3.5)); // returns 4.0
        System.out.println(Math.rint(-2.5)); // returns -2.0

        System.out.println(Math.round(2.6f)); // returns 3
        System.out.println(Math.round(2.0)); // returns 2
        System.out.println(Math.round(-2.0f)); // returns -2
        System.out.println(Math.round(-2.6)); // returns -3
        System.out.println(Math.round(-2.4)); // returns -2
    }
}
