package generics.issues.base_class_hijecks_interface;

 class CompareablePet implements Comparable<CompareablePet> {
    public int compareTo(CompareablePet arg){return 0;}
}

/* public class Cat extends CompareablePet implements Comparable<Cat> {
    public int compareTo(Cat arg){return 0;}
} */


@SuppressWarnings("unused")
class Hamstre extends CompareablePet implements Comparable<CompareablePet> {
    public int compareTo(CompareablePet arg){return 0;}
}

//or
  
/**
 * Cat
 */
public class Cat extends CompareablePet{

    public int compareTo(CompareablePet arg){return 0;}
}



