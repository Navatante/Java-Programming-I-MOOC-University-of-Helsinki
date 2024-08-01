
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(Paths.get("data.txt"))) {

            while (scanner.hasNextLine()) {
                // We read one line
                String row = scanner.nextLine();
                // We print the line that we read
                System.out.println(row);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
