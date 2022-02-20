import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        final int minYear = 1900;
        final int maxYear = 3000;

        if (year >= minYear && year <= maxYear) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("Leap");
            } else {
                System.out.println("Regular");
            }

        }
    }
}