package type_information.null_object;

import java.util.ArrayList;

public interface Null {};

// Person.java
class Person {
    public final String first;
    public final String last;
    public final String address;

    public Person(String f, String l, String a) {
        this.first = f;
        this.last = l;
        this.address = a;
    }

    public String toString() {
        return "\n***" + first + " " + last + " " + address;
    }

    public static class NullPerson extends Person implements Null {
        private NullPerson() {
            super(null, null, null);
        }

        public String toString() {
            return "NullPerson";
        }
    }

    public static final Person NULL = new NullPerson();
}

// Position.java
class Position {
    private String tital;
    private Person person;

    public Position(String job_tital, Person empolyees) {
        tital = job_tital;
        person = empolyees;
        if (person == null)
            person = Person.NULL;
    }

    public Position(String job_tital) {
        tital = job_tital;
        person = Person.NULL;
    }

    public String getTital() {
        return tital;
    }

    public void setNewTital(String new_tital) {
        tital = new_tital;
    }

    public Person getPerson() {
        return person;
    }

    public void setNewPerson(Person new_person) {
        person = new_person;
        if (person == null)
            person = Person.NULL;
    }

    public String toString() {
        return "\nPosition: " + tital + " Person: " + person;
    }
}

// Staff.java
class Staff extends ArrayList<Position> {
    public void add(String tital, Person person) {
        add(new Position(tital, person));
    }

    public void add(String... titals) {
        for (String tital : titals)
            add(new Position(tital));
    }

    public Staff(String... titals) {
        add(titals);
    }

    public boolean positionAvailable(String tital) {
        for (Position position : this) {
            if (position.getTital().equals(tital) && position.getPerson() == Person.NULL)
                return true;
        }
        return false;
    }

    public void fillPosition(String tital, Person hire) {
        for (Position position : this)
            if (position.getTital().equals(tital) && position.getPerson() == Person.NULL) {
                position.setNewPerson(hire);
                return;
            }
        throw new RuntimeException("Position: " + tital + "Not available");
    }

    public static void main(String args[]) {
        Staff staff = new Staff("Precedent", "CTO",
                "Merketing Manager", "Product Manager", "Project Lead",
                "Software Engineer", "Software Engineer",
                "Software Engineer", "Test Engineer", "Tecnical Writter");
                
        staff.fillPosition("Precedent", new Person("Me", "Last", "Top lonely at"));
        staff.fillPosition("Project Lead", new Person("Shakouat", "Hoseen", "Dhaka"));
        if (staff.positionAvailable("Software Engineer"))
            staff.fillPosition("Software Engineer", new Person("Sayed", "Coder", "Chottogram"));
        System.out.println(staff);
    }
}
