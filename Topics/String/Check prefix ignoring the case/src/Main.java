import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String isUpperCase = text.toUpperCase();
        boolean startsWithJ = isUpperCase.startsWith("J");
        System.out.println(startsWithJ);
    }
}