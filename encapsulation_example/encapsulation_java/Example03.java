package encapsulation_example.encapsulation_java;

class EncapsulExam01 {
    String name;
    String behabier;
    int age;
    String address;

    // use the getter setter method of name

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // getter and setter method of behabier
    public String getBehabier() {
        return behabier;
    }

    public void setBehabier(String behabier) {
        this.behabier = behabier;
    }

    // getter and setter method of age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // getter and setter method of address
    public String getAddres() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void _display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(behabier);
        System.out.println(address);
    }

}

public class Example03 {
    public static void main(String args[]) {
        EncapsulExam01 OB1 = new EncapsulExam01();
        OB1.setName("Sayed");
        OB1.setName("Shakouat");
        OB1.setAge(23);
        OB1.setBehabier("Human");
        OB1.setAddress("Chittagong");
        OB1._display();

    }
}
