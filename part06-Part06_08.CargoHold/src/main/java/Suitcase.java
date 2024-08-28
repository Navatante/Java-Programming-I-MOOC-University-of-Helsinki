import java.util.ArrayList;;

public class Suitcase {

    private int maxWeight;
    private ArrayList<Item> items;
    private int sumWeight;

    public Suitcase (int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (sumWeight + item.getWeight() <= this.maxWeight) {
            items.add(item);
            sumWeight += item.getWeight(); // Update sumWeight after adding an item
        }
    }

    public String toString() {
        int count = items.size();
        if (count == 0) {
            return "no items (" + sumWeight + " kg)";
        } else if (count == 1) {
            return count + " item (" + sumWeight + " kg)";
        } else {
            return count + " items (" + sumWeight + " kg)";
        }
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight+=item.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        Item heaviestItem = null;
        int weightening = 0;

        if (!items.isEmpty()) {
            for (Item item : items) {
                if(item.getWeight() > weightening) {
                    heaviestItem = item;
                    weightening = item.getWeight(); // Update weightening when a heavier item is found
                }
            }
        }
        return heaviestItem;
    }
}
