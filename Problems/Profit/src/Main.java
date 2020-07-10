import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double originalMoney;
        double interest;
        double targetMoney;
        int years = 0;

        originalMoney = scanner.nextInt();
        interest = scanner.nextInt();
        targetMoney = scanner.nextInt();

        while (originalMoney < targetMoney) {
            originalMoney += originalMoney * (interest / 100);
            years++;
        }

        System.out.println(years);
    }
}