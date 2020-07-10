import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) {
        // Initialization
        Scanner scanner = new Scanner(System.in);
        StringTokenizer strTok;
        ArrayList<Integer> sequence = new ArrayList<>();
        long timesToRot;

        // Input
        strTok = new StringTokenizer(scanner.nextLine());
        while (strTok.hasMoreTokens()) {
            sequence.add(Integer.parseInt(strTok.nextToken()));
        }
        timesToRot = scanner.nextLong();

        // Calculation
        timesToRot %= sequence.size();
        for (int i = 0; i < timesToRot; i++) {
            rightRotOne(sequence);
        }

        // Output
        for (int number : sequence) {
            System.out.print(number + " ");
        }
    }

    private static void rightRotOne(ArrayList<Integer> arrayList) {
        // Instantiation
        ArrayList<Integer> tempArray = (ArrayList<Integer>) arrayList.clone();

        // Calculation
        arrayList.set(0, tempArray.get(tempArray.size() - 1));
        for (int i = 0; i < tempArray.size() - 1; i++) {
            arrayList.set(i + 1, tempArray.get(i));
        }
    }
}