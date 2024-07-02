package java_interface;

interface SayedA {
    public void details();
}

class PersonInfo implements SayedA {
    int roll_num = 102;
    String name = "Sayed Shakouat";

    public void details() {
        System.out.println("The roll number is: " + roll_num);
        System.out.println("Student name is: " + name);
    }
}

public class InterfaceExamE {
    public static void main(String args[]) {
        PersonInfo OB1 = new PersonInfo();
        OB1.details();
    }
}
