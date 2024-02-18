
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to?");
        System.out.println("Where from?");
        int to = Integer.parseInt(scanner.nextLine());
        int from = Integer.parseInt(scanner.nextLine());
        
        for (; to >= from; from++) {
            System.out.println(from);
        }
    }
}
