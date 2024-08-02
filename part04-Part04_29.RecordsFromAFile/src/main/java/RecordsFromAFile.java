
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Name of the file: ");
        String fileName = scanner.nextLine();

        try (Scanner scFile = new Scanner(Paths.get(fileName))) {

            while(scFile.hasNextLine()) {
                String row = scFile.nextLine();
                String[] parts = row.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                System.out.println(name + ", age: " + age + " years" );

            }

        } catch (Exception e) {
            System.out.println("Error name" + e.getMessage());
        }

    }
}
