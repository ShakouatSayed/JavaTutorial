package PackageFour;

class member {
    String name;
    String idNum;
    String emailAdd;
    int yearOfBirth;

    void show() {
        System.out.println("\nName: " + name);
        System.out.println("Id Name: " + idNum);
        System.out.println("Email Address: " + emailAdd);
        System.out.println("Year Of Address: " + yearOfBirth);
    }
}

public class test01 {
    public static void main(String args[]) {
        member e1 = new member();
        e1.name = "Shakout Hossen Sayed.";
        e1.idNum = "666-53-26";
        e1.emailAdd = "sayedckb61@gmail.com";
        e1.yearOfBirth = 2001;
        e1.show();
        member e2 = new member();
        e2.name = "Shakout Hossen Sayed.";
        e2.idNum = "666-53-27";
        e2.emailAdd = "sayedckb@gmail.com";
        e2.yearOfBirth = 1999;
        e2.show();
    }
}
