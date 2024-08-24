import java.util.ArrayList;

public class Stack {
    ArrayList<String> stack = new ArrayList<>();

    public boolean isEmpty() {
        return stack.isEmpty() ? true : false;
    }

    public void add(String value) {
        stack.add(value);
    }

    public String take() {
        String last = stack.get(stack.size()-1);
        stack.remove(last);
        return last;
        
    }

    public ArrayList<String> values() {
        return stack;
    }
}
