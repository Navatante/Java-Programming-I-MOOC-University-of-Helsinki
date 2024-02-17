
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int negativeCount = 0;
        int number = 1;
        while (number != 0) {
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());

            if (number <= -1 ) {
                negativeCount++;
            }
        }
        System.out.println("Number of negative numbers: " + negativeCount);
    }
}
