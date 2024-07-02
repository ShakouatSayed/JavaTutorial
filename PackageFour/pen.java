/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageFour;

//import PackageFour.Student_manegment_system.Student;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class pen {
    public static void main(String args[]){
        // pen_class s = new pen_class();
        pen_class.i = 17;
        System.out.println("The addition is: "+pen_class.add(33.4, 30));
        pen_class.add();
        con_class s1 = new con_class();
        con_class s2 = new con_class(45, 78);
        System.out.println(" X = "+con_class.x+"\nY = "+con_class.y);
        con_class1 s3 = new con_class1("Sayed");
        //Student s1 = new Student();
    }
}
