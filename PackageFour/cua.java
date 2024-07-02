package PackageFour;
import java.io.*;
public class cua{
    public static void main(String args[]){
        studentManagement s1 = new studentManagement();
        //Scanner sc = new Scanner(System.in);
        //String s = sc.nextLine();
        //int a = sc.nextInt();
        s1.Student("Sayed.");
        s1.Teacher("Shakouat Hossen.");
        s1.Course("Software Engineering.");
        s1.Grade(3.99);
        studentManagement s2 = new studentManagement();
        //Scanner sc = new Scanner(System.in);
        //String s = sc.nextLine();
        //int a = sc.nextInt();
        s2.Student("Sayed.");
        s2.Teacher("Shakouat Hossen.");
        s2.Course("Software Engineering.");
        s2.Grade(3.99);
    }
}

class studentManagement{
    public static String Student(String s){
        System.out.println("\nThe Student name is: "+s);
        return s;
    }
    public static String Teacher(String s){
        System.out.println("This Students Teacher name is: "+s);
        return s;
    }
    public static String Course (String s){
        System.out.println("This Teacher Course name is: "+s);
        return s;
    }
    public static double Grade(double d){
        //double d = 40.8 ;
        System.out.println("This student grade is: "+d);
        return d;
    }
}