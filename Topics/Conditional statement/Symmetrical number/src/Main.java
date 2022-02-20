import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nr = scanner.next();

        if (nr.charAt(0) == nr.charAt(3) && nr.charAt(1) == nr.charAt(2)) {
            System.out.println("1");
        } else {
            System.out.println("37");
        }
    }
}