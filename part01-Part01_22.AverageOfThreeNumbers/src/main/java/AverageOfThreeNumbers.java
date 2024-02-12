
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        double first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        double second = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        double third = Integer.valueOf(scanner.nextLine());

        double result = (first + second + third) / 3;
        System.out.println("The average is " + result);

    }
}
