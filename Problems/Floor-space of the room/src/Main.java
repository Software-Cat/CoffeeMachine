import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();

        double a;
        double b;
        double c;
        double r;
        double area;

        switch (shape) {
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();

                double p = (a + b + c) / 2.0;
                area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

                System.out.println(area);
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();

                area = a * b;

                System.out.println(area);
                break;
            case "circle":
                r = scanner.nextDouble();

                area = 3.14 * r * r;

                System.out.println(area);
                break;
            default:
                break;
        }
    }
}