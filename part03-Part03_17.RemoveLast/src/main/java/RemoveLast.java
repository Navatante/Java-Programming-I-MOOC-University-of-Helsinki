
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hola");
        list.add("y...");
        list.add("adios");

        removeLast(list);
        System.out.println(list);
    }

    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() == 0) {
            return;
        }
        strings.remove(strings.size()-1);
    }

}
