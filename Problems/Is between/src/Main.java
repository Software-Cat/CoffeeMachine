import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int lim1 = scanner.nextInt();
        int lim2 = scanner.nextInt();

        System.out.println(lim1 <= num && num <= lim2 || lim1 >= num && num >= lim2);
    }
}