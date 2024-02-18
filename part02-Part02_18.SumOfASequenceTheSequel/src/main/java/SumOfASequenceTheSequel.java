
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Second numer?");
        int second = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (;second>=first;first++) {
            sum+=first;
        }
        System.out.println("The sum is " + sum);
    }
}
