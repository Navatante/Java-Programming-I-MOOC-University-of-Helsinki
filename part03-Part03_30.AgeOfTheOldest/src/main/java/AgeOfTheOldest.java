
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = new String[0];
        int last = 0;
        int oldest = 0;
        while (true) {
            String text = scanner.nextLine();
            if (text.isEmpty()) {
                break;
            } else {
                array = text.split(",");
                last = array.length-1;
                int value = Integer.valueOf(array[last]);
                if (value > oldest) {
                    oldest = value;
                }
            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
