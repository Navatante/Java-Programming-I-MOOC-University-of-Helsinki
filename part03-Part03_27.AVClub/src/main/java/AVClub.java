
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String text = scanner.nextLine();
            if (text.isEmpty()) {
                break;
            } else {
                String [] array = text.split(" ");
                for (String string : array) {
                    if (string.contains("av")) {
                        System.out.println(string);
                    }
                }
            }
        }
    }
}
