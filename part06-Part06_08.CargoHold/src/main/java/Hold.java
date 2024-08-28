import java.util.ArrayList;

public class Hold {
    
    private int maxWeight;
    private ArrayList<Suitcase> holdList;
    private int sumHoldWeight;

    public Hold (int maxWeight) {
        holdList = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if(sumHoldWeight + suitcase.totalWeight() <= this.maxWeight) {
            holdList.add(suitcase);
            sumHoldWeight += suitcase.totalWeight();
        }
    }
    
    @Override
    public String toString() {
        int count = holdList.size();
        return count + " suitcases (" + sumHoldWeight + " kg)";
    }
    
    public void printItems() {
        for (Suitcase suitcase : holdList) {
            suitcase.printItems();
        }
    }


}
