public class Main {
    public static void main(String[] args) {
        System.out.println("a\ta^2\ta^3");
        for(int i=1; i<5; i++){
            int u=i;
            for(int j=0;j<3;j++){
                System.out.print(u);
                System.out.print("\t");
                u *= i;
            }
            System.out.println();
        }
    }
}