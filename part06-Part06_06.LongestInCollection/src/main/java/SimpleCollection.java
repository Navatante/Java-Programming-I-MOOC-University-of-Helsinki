
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {
        if (elements.isEmpty()) {
            return null;
        } else {
            String longest = "";
            for (String string : elements) {
                if (string.length()>longest.length()) {
                    longest = string;
                }
            }
            return longest;
        }
    }

}
