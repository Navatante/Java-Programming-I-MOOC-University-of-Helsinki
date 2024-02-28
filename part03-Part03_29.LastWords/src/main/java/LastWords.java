
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String text = scanner.nextLine();
            if (text.isEmpty()) {
                break;
            } else {
                String [] array = text.split(" ");
                int n = array.length-1;
                System.out.println(array[n]);
            }
        }
    }
}
