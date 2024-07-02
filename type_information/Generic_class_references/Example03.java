package type_information.Generic_class_references;

public class Example03 {
  public static void main(String args[]) {
    Class<?> intClass = int.class;
    intClass = double.class;

    Class<?> doubleClass = double.class;
    System.out.println(doubleClass);

    Class<? extends Number> bounded = int.class;
    bounded = double.class;
    bounded = Number.class;
    System.out.println(bounded);
  }
}
