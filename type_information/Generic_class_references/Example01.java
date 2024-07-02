package type_information.Generic_class_references;

public class Example01 {
    public static void main(String args[]) {
        Class intClass = int.class;
        Class<Integer> inTClass = int.class;
        inTClass = Integer.class;
        intClass = double.class;
        //string_class = String.class;

        // this is illegal.
        //inTClass = double.class;
        System.out.println("Message: " +inTClass);
        System.out.println("Some message: "+intClass);
    }
}


