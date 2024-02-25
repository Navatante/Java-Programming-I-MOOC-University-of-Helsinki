
import java.util.ArrayList;

public class PrintInRange {

    public static void printNumbersInRange(ArrayList<Integer> list, int low, int high) {
        System.out.println("The numbers in the range ["+low+","+high+"]");
        for (Integer integer : list) {
            if( integer > low && integer < high) {
                System.out.println(integer);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(3);
        numbers.add(6);
printNumbersInRange(numbers, 1, 6);


    }
}
