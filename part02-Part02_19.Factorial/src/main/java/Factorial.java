
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, factorial;
        System.out.println("Give a number:");
        number = Integer.parseInt(scanner.nextLine());
        factorial = 1;
        for (int i = 1; i <=number; i++) {
            factorial*=i;
        }
        System.out.println("Factorial: " + factorial);
    }
}
