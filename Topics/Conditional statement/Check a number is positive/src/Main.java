import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr = scanner.nextInt();

        if (nr > 0) {
            System.out.println("YES");
        } else if (nr < 0) {
            System.out.println("NO");
        } else if (nr == 0) {
            System.out.println("NO");
        }
    }
}