
public class Statistics {
    private int count;
    private int sum;

    public Statistics() { 
    }

    public void addNumber(int number) {
        this.sum += number;
        count++;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (count == 0) {
            return 0.0;
        } else {
            return (double)sum/count;
        }
    }
}
