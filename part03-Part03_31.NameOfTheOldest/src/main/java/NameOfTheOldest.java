import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = 0;
        String oldestName = "";

        while (true) {
            String text = scanner.nextLine();
            if (text.isEmpty()) {
                break;
            } else {
                String[] array = text.split(",");
                for (int i = 1; i < array.length; i += 2) {
                    int age = Integer.valueOf(array[i]);
                    if (age > oldestAge) {
                        oldestAge = age;
                        oldestName = array[i - 1];
                    }
                }
            }
        }
        System.out.println("Name of the oldest: " + oldestName);
    }
}
