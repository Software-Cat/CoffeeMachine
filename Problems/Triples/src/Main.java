import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Declaration
        Scanner scanner = new Scanner(System.in);
        int[] sequence = new int[scanner.nextInt()];

        // Initialization
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = scanner.nextInt();
        }

        // Calculation
        int triples = 0;
        for (int i = 0; i < sequence.length - 2; i++) {
            if (sequence[i] + 1 == sequence[i + 1] && sequence[i + 1] + 1 == sequence[i + 2]) {
                triples += 1;
            }
        }

        // Output
        System.out.println(triples);
    }
}