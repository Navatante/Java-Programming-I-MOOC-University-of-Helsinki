
import java.util.Scanner;
import java.util.ArrayList;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> usersPass = new ArrayList<>();
        usersPass.add("alex");
        usersPass.add("sunshine");
        usersPass.add("emma");
        usersPass.add("haskell");

        System.out.println("Enter username:");
        String user = scanner.nextLine();
        System.out.println("Enter password:");
        String pass = scanner.nextLine();

        if (user.equals(usersPass.get(0)) && pass.equals(usersPass.get(1)) || (user.equals(usersPass.get(2)) && pass.equals(usersPass.get(3)))) {
            System.out.println("You have successfully loegged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
        

    }
}
