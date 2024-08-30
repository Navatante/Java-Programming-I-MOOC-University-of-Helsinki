import java.util.ArrayList;

public class TodoList {
    
    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        this.list.add(task);
    }

    public void print() {
        for (String string : list) {
            System.out.println((this.list.indexOf(string)+1)+": " + string);
        }
    }

    public void remove(int number) {
        int indexToRemove = number-1;
        list.remove(indexToRemove);
    }
}
