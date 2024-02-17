import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int theSum = 0;
        int theCount = 0;
        double theAverage = 0;
        int inputNumber = 1;
        
        while (inputNumber != 0) {
            System.out.println("Give a number:");
            inputNumber = Integer.valueOf(scanner.nextLine());

            if(inputNumber > 0) {
                theSum += inputNumber;
                theCount++;
                theAverage = (double)theSum/theCount;
            }
        }
        if(theCount > 0) {
            System.out.println(theAverage);
        } else {
            System.out.println("Cannot calculate the average");
        }
        
    }
}