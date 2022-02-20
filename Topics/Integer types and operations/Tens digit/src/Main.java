import java.util.Scanner;

class Main {
    public static final int minNr = 0;
    public static final int maxNr = 1000000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (minNr <= n && n <= maxNr) {
            System.out.println((n / 10) % 10);
        }
    }
}