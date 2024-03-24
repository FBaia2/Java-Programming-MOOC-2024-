import java.util.ArrayList;

public class Room {
    private ArrayList<Person> peeps; // This should be ArrayList of Person

    public Room() {
        this.peeps = new ArrayList<>();
    }

    public void add(Person person) {
        this.peeps.add(person);
    }

    public boolean isEmpty() {
        return this.peeps.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.peeps;
    }

    public Person shortest() {

        if (this.peeps.isEmpty()) {
            return null;
        }

        Person returnObject = this.peeps.get(1);

        for (Person prs : this.peeps) {

            if (returnObject.getHeight() > prs.getHeight()) {

                returnObject = prs;
            }
        }

        return returnObject;

    }

    public Person take() {
        Person returnObject = this.shortest();
        if (returnObject != null) {
            this.peeps.remove(returnObject);
        }
        return returnObject;
    }
}
