
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }
            Integer cube = Integer.valueOf(input);
            cube = (int) Math.pow(cube, 3);
            System.out.println(cube);
        }
    }
}