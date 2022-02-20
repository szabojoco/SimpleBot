import java.util.Scanner;

class Main {
    public static final int nr1 = 1;
    public static final int nr2 = 2;
    public static final int nr3 = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(((n + nr1) * n + nr2) * n + nr3);
    }
}