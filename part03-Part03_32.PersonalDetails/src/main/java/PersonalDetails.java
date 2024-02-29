import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        double sum = 0;
        int count = 0;

        while (true) {
            String text = scanner.nextLine();
            if (text.isEmpty()) {
                break;
            } else {
                String[] array = text.split(",");
                for (int i = 0; i < array.length; i += 2) { // iterate over names only
                    if (array[i].length() > longestName.length()) {
                        longestName = array[i];
                    }
                }
                for (int e = 1; e < array.length; e+=2) {
                    sum += Double.valueOf(array[e]);
                    count++;
                }
            }
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of virth years: " + (double)(sum/count));
    }
}
