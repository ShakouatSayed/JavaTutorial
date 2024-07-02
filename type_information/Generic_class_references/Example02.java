package type_information.Generic_class_references;

public class Example02 {
    public static void main(String args[]){
        Class <Number> number = Number.class;
        System.out.println(number.getName());
        System.out.println(number.getName()+" : "+number.isInstance(number));
    }
}
