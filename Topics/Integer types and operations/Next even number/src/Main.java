import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr = scanner.nextInt();

        if (nr % 2 == 0) {
            System.out.println(nr + 2);
        } else {
            System.out.println(nr + 1);
        }
    }
}