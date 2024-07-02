/*How preform in garbage collace in java program. */

package problem_solving_question;

public class GarbageCollection {

    //java program to count number
    //of empolyee working
    //in a company

    private int id;
    private String name;
    private int age;
    private static int next_id = 1;

    //it is made  static because it is keep common among all and 
    //shared by all object
    public GarbageCollection(String name, int age){
        this.name = name;
        this.age = age;
        this.id = next_id++;
    }

    public void show(){
        System.out.println("ID: "+id+"\t"+"Name: "+name+"\t"+"Age: "+age);
    }

    public void showNextId(){
        System.out.println("Next employee id will be: "+next_id);
    }

    public static void main(String[] args) {
        GarbageCollection e1 = new GarbageCollection("Shakouat", 25);
        GarbageCollection e2 = new GarbageCollection("Hossen ", 23);
        GarbageCollection e3 = new GarbageCollection("Sayed", 24);
        e1.show();
        e2.show();
        e3.show();

        System.out.println("print the next_id");
        e1.showNextId();
        e2.showNextId();
        e3.showNextId();

        System.out.println("sub block to keep");
        //all those interns

        {
            GarbageCollection x = new GarbageCollection("Sakhawat", 22);
            GarbageCollection y = new GarbageCollection("Hossaing", 23);
            x.show();
            y.show();

            System.out.println("show the next id");
            x.showNextId();
            y.showNextId();
        }

        //after countering this brace, x and y
        //will be removed. Therefore, 
        //now it should show nextId as 4

        System.out.println("output of this line");
        e1.showNextId();
        //should be 4 but it will give 6 as output
    }
}
