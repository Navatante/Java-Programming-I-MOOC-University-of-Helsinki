
public class HealthStation {

    private int weighingsCount;

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.weighingsCount++;
        return person.getWeight();
        
    }

    public void feed (Person person) {
        person.setWeight(person.getWeight()+1);
    }
               
    public int weighings() {
        return this.weighingsCount;
    }
}
