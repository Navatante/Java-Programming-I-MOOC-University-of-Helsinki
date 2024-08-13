
public class Main {

    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(30, 12, 2011);
        
        date.advance(3);
        System.out.println(date);
        //date.afterNumberOfDays(1);
        //System.out.println(date);
        //System.out.println(date.afterNumberOfDays(1));
    }
}
