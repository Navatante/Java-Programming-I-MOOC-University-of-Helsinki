
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");
        int number = scan.nextInt();

        if (number < 18) {
            System.out.println("You are not an andult");
        } else {
            System.out.println("You are an adult");
        } 
    }
}
