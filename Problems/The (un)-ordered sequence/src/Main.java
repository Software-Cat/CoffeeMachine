import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> originalList = new ArrayList<>();
        ArrayList<Integer> ascendingList;
        ArrayList<Integer> descendingList;


        int currentInt = scanner.nextInt();
        while (currentInt != 0) {
            originalList.add(currentInt);
            currentInt = scanner.nextInt();
        }

        ascendingList = (ArrayList<Integer>) originalList.clone();
        descendingList = (ArrayList<Integer>) originalList.clone();
        Collections.sort(ascendingList);
        Collections.sort(descendingList, Collections.reverseOrder());

        boolean isEquivalent = ascendingList.equals(originalList) || descendingList.equals(originalList);
        if (isEquivalent) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}