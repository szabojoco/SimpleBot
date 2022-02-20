import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr = scanner.nextInt();
        final int min = 0;
        final int max = 10;

        System.out.println(nr > min && nr < max);
    }
}