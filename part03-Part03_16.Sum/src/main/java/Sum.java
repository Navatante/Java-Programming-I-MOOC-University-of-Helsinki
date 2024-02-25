
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        
        System.out.println(Sum.sum(numbers));

    }
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum +=integer;
        }
        return sum;
    }
}
