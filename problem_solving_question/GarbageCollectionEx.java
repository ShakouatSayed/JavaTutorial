package problem_solving_question;

public class GarbageCollectionEx {
    //correct code to count number 
    //to employ excluding interns
    private String name;
    private int id;
    private int age;
    private static int next_id = 1;

    public GarbageCollectionEx(String name, int age){
        this.name = name;
        this.age = age;
        this.id = next_id++;
        System.out.println("");
    }

    public void show(){
        System.out.println("Id: "+id+"\t"+"Name: "+name+"\t"+"Age: "+age);
    }

    public void showNextId(){
        System.out.println("Next employee id will be: "+next_id);
    }

    protected void finalized(){
        --next_id;
        //in this case, 
        //gc will call finialze()
        //for 2 time 2 object
    }


    public static void main(String[] args) {

        GarbageCollectionEx e1 = new GarbageCollectionEx("Sakhawat",23);
        GarbageCollectionEx e2 = new GarbageCollectionEx("Hossain", 24);
        GarbageCollectionEx e3 = new GarbageCollectionEx("Sayed", 25);

        System.out.println("Show the employee details: ");
        e1.show();
        e2.show();
        e3.show();

       System.out.println("Show the employee id: ");
       e1.showNextId();
       e2.showNextId();
       e3.showNextId();
       
       System.out.println("The another employee details: ");
       {
        GarbageCollectionEx x = new GarbageCollectionEx("Shakouat", 21);
        GarbageCollectionEx y = new GarbageCollectionEx("Hossen", 22);
        
        System.out.println("Show another employee details");

        x.show();
        y.show();

        System.out.println("Show another employee id:");
        x.showNextId();
        y.showNextId();

        x = y = null;
        System.gc();
        System.runFinalization();

       }
       e1.showNextId();
        System.out.println("Shakouat Hossen Sayed");
    }    
}
