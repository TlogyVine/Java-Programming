public class Main {
    public static void main(String[] args) {
        double perSecond = 1.0/7 - 1.0/13 + 1.0/45;
        double perYear = perSecond * 3600 * 24 * 365;
        double p = 312032486;
        for(int i=0; i<5; i++){
            p += perYear;
        }
        int p_int = (int)(p);
        System.out.println(p_int);
    }
}