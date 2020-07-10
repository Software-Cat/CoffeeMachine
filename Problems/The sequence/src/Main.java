import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seqLength = scanner.nextInt();
        int currentLength = 0;
        int currentNum = 1;

        boolean running = true;
        while (running) {
            for (int i = 0; i < currentNum; i++) {
                if (currentLength >= seqLength) {
                    running = false;
                    break;
                }
                System.out.println(currentNum + " ");
                currentLength++;
            }
            currentNum++;
        }
    }
}