
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int number = scanner.nextInt();
        int secondsInNumber = number * 86400;
        System.out.println(secondsInNumber);


    }
}
