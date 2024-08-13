import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> list = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (Empty will stop)");
            String idInput = scanner.nextLine();
            if (idInput.isEmpty()) {
                break;
            }
            System.out.println("Name? (Empty will stop)");
            String nameInput = scanner.nextLine();
            if (nameInput.isEmpty()) {
                break;
            }

            Item newItem = new Item(nameInput, idInput);
            boolean exists = false;
            for (Item item : list) {
                if (item.compareTo(newItem)) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                list.add(newItem);
            }
        }
        for (Item item : list) {
            System.out.println(item);
        }
    }
}
