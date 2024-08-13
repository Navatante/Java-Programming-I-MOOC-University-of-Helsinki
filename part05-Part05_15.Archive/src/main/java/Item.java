
public class Item {

    private String name, id;

    public Item(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public boolean compareTo (Item itemToCompare) {
        return this.id.equals(itemToCompare.id);
    }

    public String toString() {
        return this.id + ": " + this.name;
    }
}