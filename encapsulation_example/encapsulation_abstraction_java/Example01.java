package encapsulation_example.encapsulation_abstraction_java;

class UniversitySys {
    private String university_name;
    private float reg_no;
    private int area;

    // use the getter and setter method
    public String getUniveristyName() {
        return university_name;
    }

    public void setUniversityName(String university_name) {
        this.university_name = university_name;
    }

    // use the getter and setter method
    public float getRegNo() {
        return reg_no;
    }

    public void setRegNo(float reg_no) {
        this.reg_no = reg_no;
    }

    // use the getter and setter method
    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}

public class Example01 {
    public static void main(String args[]) {
        UniversitySys OB1 = new UniversitySys();
        OB1.setUniversityName("Southern University Bangladesh.");
        OB1.setRegNo(2433.24f);
        OB1.setArea(415);
        System.out.println("University name: " + OB1.getUniveristyName());
        System.out.println("University Area: " + OB1.getArea());
        System.out.println("University Registresion Number: " + OB1.getRegNo());
    }
}
