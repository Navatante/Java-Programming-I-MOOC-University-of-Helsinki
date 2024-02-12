
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        int suma = first + second;
        int resta = first - second;
        int mul = first * second;
        
        double div = (first*1.0) / (second*1.0);
        System.out.println(first + " + " + second + " = " + suma);
        System.out.println(first + " - " + second + " = " + resta);
        System.out.println(first + " * " + second + " = " + mul);
        System.out.println(first + " / " + second + " = " + div);

    }
}
