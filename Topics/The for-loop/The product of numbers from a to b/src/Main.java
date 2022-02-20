import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr1 = scanner.nextInt();
        int nr2 = scanner.nextInt();
        long sum = 1;

        for ( ;nr1 < nr2; nr1++) {
            sum *= nr1;
        }
        System.out.println(sum);
    }
}