import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String text = scanner.nextLine();
            if (text.isEmpty()) {
                break;
            } else {
                String [] array = text.split(" ");
                for (String string : array) {
                    System.out.println(string);
                }
            }
        }
    }
}
