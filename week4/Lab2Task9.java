public class Lab2Task9 {
    public static void main(String[] args) {
        double monthlySave = 100;
        double annualRate = 0.05;
        double monthlyRate = annualRate / 12;

        double total = 0;
        int months = 3;

        for (int i = 1; i <= months; i++) {
            total = (total + monthlySave) * (1 + monthlyRate); // 计算总金额
            System.out.printf("After the %d month, the value in the account becomes %.3f\n", i, total);
        }
    }
}