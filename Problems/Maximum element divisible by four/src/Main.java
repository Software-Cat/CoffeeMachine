import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seqLen = scanner.nextInt();
        int max = 0;

        for (int i = 0; i < seqLen; i++) {
            int currentNum = scanner.nextInt();
            max = currentNum % 4 == 0 ? Math.max(currentNum, max) : max;
        }

        System.out.println(max);
    }
}