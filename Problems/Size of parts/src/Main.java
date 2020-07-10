import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalParts;
        int largerParts = 0;
        int perfectParts = 0;
        int smallerParts = 0;

        totalParts = scanner.nextInt();
        for (int i = 0; i < totalParts; i++) {
            int currentPart = scanner.nextInt();
            if (currentPart == 1) {
                largerParts++;
            } else if (currentPart == 0) {
                perfectParts++;
            } else {
                smallerParts++;
            }
        }

        System.out.println(perfectParts + " " + largerParts + " " + smallerParts);
    }
}