import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // New array
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[scanner.nextInt()];

        // Input
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Processing
        int min = scanner.nextInt();
        int sum = 0;
        for (int number : numbers) {
            if (number > min) {
                sum += number;
            }
        }

        // Output
        System.out.println(sum);
    }
}