import java.util.ArrayList;;

public class Room {

    ArrayList<Person> personList;

    public Room() {
        personList = new ArrayList<>();
    }

    public void add(Person person) {
        this.personList.add(person);
    }

    public boolean isEmpty() {
        if(this.personList.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Person> getPersons() {
        if (!isEmpty()) {
            return this.personList;
        } else {
            return null;
        }
    }

    public Person shortest() {
        if (!isEmpty()) {
            Person shortestPerson = personList.get(0);
            for (Person person : personList) {
                if (person.getHeight() < shortestPerson.getHeight()) {
                    shortestPerson = person;
                }
            }
            return shortestPerson;
        } else {
            return null;
        }
    }

    public Person take() {
        if (!isEmpty()) {
            Person shortestName = shortest();
            this.personList.remove(shortest());
            return shortestName;
        } else {
            return null;
        }
    }
}
