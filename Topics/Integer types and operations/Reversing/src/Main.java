import java.util.Scanner;

class Main {
    public static final int TEN = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr = scanner.nextInt();
        int digit1 = nr % TEN;
        int digit2 = nr / TEN % TEN;
        int digit3 = nr / (TEN * TEN) % TEN;
        String sumString = "" + digit1 + digit2 + digit3;
        int sum = Integer.parseInt(sumString);

        System.out.println(sum);
    }
}