
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int theSum = 0;
        int theCount = 0;
        double theAverage = 0;
        int inputNumber = 1;
        
        while (inputNumber !=0) {
            System.out.println("Give a number:");
            inputNumber = Integer.valueOf(scanner.nextLine());

            theSum+=inputNumber;

            if(inputNumber != 0) {
                theCount++;
            }
            theAverage = (double)theSum/theCount;
        }
        System.out.println("Average of the numbers: " + theAverage);
    }
}
