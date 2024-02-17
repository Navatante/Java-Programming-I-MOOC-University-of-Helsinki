
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int theSum = 0;
        int inputNumber = 1;
        
        while (inputNumber !=0) {
            System.out.println("Give a number:");
            inputNumber = Integer.valueOf(scanner.nextLine());

            theSum+=inputNumber;
        }
        System.out.println("Sum of the numbers: " + theSum);
    }
}
