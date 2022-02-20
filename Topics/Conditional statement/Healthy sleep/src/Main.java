import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sleepMin = scanner.nextInt();
        int sleepMax = scanner.nextInt();
        int sleepHours = scanner.nextInt();

        if (sleepHours < sleepMin) {
            System.out.println("Deficiency");
        } else if (sleepHours > sleepMax) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}