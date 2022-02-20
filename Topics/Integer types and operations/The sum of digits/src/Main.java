import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr = scanner.nextInt();

        int digit1 = nr % 10;
        int digit2 = (nr / 10) % 10;
        int digit3 = ((nr / 10) / 10) % 10;

        System.out.println(digit1 + digit2 + digit3);
    }
}