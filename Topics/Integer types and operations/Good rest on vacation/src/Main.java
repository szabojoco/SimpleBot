import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int foodCostPerDay = scanner.nextInt();
        int oneFlight = scanner.nextInt();
        int oneNightHotel = scanner.nextInt();

        int sum = days * foodCostPerDay + oneFlight * 2 + oneNightHotel * (days - 1);
        System.out.println(sum);
    }
}