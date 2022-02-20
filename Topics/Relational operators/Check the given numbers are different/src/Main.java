import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        final int expectedSize = 3;
        Scanner scanner = new Scanner(System.in);
        Set<String> inputAsSet = scanner.tokens().collect(Collectors.toSet());
        boolean isInputSetOfExpectedSize = inputAsSet.size() == expectedSize;
        System.out.println(isInputSetOfExpectedSize);
    }
}