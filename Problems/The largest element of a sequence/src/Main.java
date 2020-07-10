import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNum = 0;

        int currentNum;
        do {
            currentNum = scanner.nextInt();
            maxNum = Math.max(currentNum, maxNum);
        } while (currentNum != 0);

        System.out.println(maxNum);
    }
}