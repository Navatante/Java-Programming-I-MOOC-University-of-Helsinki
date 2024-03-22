
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            items.add(new Item(name));
        }
         for (Item item : items) {

            System.out.println(item.toString()); // Print the string representation of objetos
        }
        
        scanner.close(); // Close the Scanner object
    }
}
