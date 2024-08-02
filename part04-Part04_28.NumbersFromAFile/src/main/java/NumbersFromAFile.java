
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Integer rowNumber = null;
        int count = 0;

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try (Scanner sc = new Scanner(Paths.get(file))) {

            while(sc.hasNextLine()) {
                rowNumber = Integer.valueOf(sc.nextLine());
                list.add(rowNumber);
                if (rowNumber >= lowerBound & rowNumber <= upperBound) {
                count++;
                }
            }   
            System.out.println("Numbers: " + count);
        } catch (Exception e) {
            System.out.println("File not found.");
        }

    }

}
