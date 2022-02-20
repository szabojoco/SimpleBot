import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsOnGroup1 = scanner.nextInt();
        int studentsOnGroup2 = scanner.nextInt();
        int studentsOnGroup3 = scanner.nextInt();

        int deskForGroup1 = studentsOnGroup1 / 2 + studentsOnGroup1 % 2;
        int deskForGroup2 = studentsOnGroup2 / 2 + studentsOnGroup2 % 2;
        int deskForGroup3 = studentsOnGroup3 / 2 + studentsOnGroup3 % 2;

        System.out.println(deskForGroup1 + deskForGroup2 + deskForGroup3);
    }
}