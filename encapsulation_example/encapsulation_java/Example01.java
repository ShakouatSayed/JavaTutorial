package encapsulation_example.encapsulation_java;

class EncapsulaExap01 {
    private int id;
    private String name;

    // getter setter method of id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // getter setter method of name
    // another one getter method
    public String getName(String name) {
        return name;
    }

    public String getName1() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class Example01 {
    public static void main(String args[]) {
        EncapsulaExap01 OB1 = new EncapsulaExap01();

        OB1.setId(10);
        System.out.println("ID NO: ...." + OB1.getId());

        OB1.setName("Shakouat....");
        String s = OB1.getName("Sayed");
        System.out.println(OB1.getName1());
    }
}
