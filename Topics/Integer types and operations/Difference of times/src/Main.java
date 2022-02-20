import java.util.Scanner;

class Main {
    public static final int MULTIPLYER = 60;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourFrom = scanner.nextByte();
        int minuteFrom = scanner.nextByte();
        int secondFrom = scanner.nextByte();
        int hourUntil = scanner.nextByte();
        int minuteUntil = scanner.nextByte();
        int secondUntil = scanner.nextByte();

        int minuteFromSum = hourFrom * MULTIPLYER + minuteFrom;
        int secondFromSum = minuteFromSum * MULTIPLYER + secondFrom;

        int minuteUntilSum = hourUntil * MULTIPLYER + minuteUntil;
        int secondUntilSum = minuteUntilSum * MULTIPLYER + secondUntil;

        System.out.println(secondUntilSum - secondFromSum);
    }
}