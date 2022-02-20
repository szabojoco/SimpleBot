import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int army = scanner.nextInt();
        final int armyMinLimit = 1;
        final int packLimit = 20;
        final int throngLimit = 250;
        final int zoundsLimit = 1000;

        if (army < armyMinLimit) {
            System.out.println("no army");
        } else if (army >= armyMinLimit && army < packLimit) {
            System.out.println("pack");
        } else if (army >= packLimit && army < throngLimit) {
            System.out.println("throng");
        } else if (army >= throngLimit && army < zoundsLimit) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}