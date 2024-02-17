
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int theSum = 0;
        int theCount = 0;
        int inputNumber = 1;
        
        while (inputNumber !=0) {
            System.out.println("Give a number:");
            inputNumber = Integer.valueOf(scanner.nextLine());

            theSum+=inputNumber;

            if(inputNumber != 0) {
                theCount++;
            }
        }
        System.out.println("Number of numbers: " + theCount);
        System.out.println("Sum of the numbers: " + theSum);
    }
}
