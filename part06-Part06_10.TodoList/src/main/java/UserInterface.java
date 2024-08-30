import java.util.Scanner;

public class UserInterface {
    private TodoList interfaceList;
    private Scanner interfaceScanner;

    public UserInterface(TodoList interfaceList, Scanner interfaceScanner) {
        this.interfaceList = interfaceList;
        this.interfaceScanner = interfaceScanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.interfaceScanner.nextLine();
            if(command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.print("To add: ");
                String toAdd = this.interfaceScanner.nextLine();
                this.interfaceList.add(toAdd);
            } else if (command.equals("list")) {
                this.interfaceList.print();
            } else if (command.equals("remove")) {
                System.out.print("Which one is removed?");
                int numberToRemove = Integer.parseInt(this.interfaceScanner.nextLine());
                this.interfaceList.remove(numberToRemove);
            }
        }
    }

}
