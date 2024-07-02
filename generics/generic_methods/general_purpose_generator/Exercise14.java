/* Exercise 14: (1) Modify BasicGeneratorDemo.java to use the explicit form of
creation for the Generator (that is, use the explicit constructor instead of the generic
create( ) method).  */

package generics.generic_methods.general_purpose_generator;

import generics.generic_interfaces.coffee.Generator;

/* public class Exercise14CarExample {
    private String car;
    private int year;

    //explicit constructor 
    public Exercise14CarExample(String brand, int year){
        this.car = brand;
        this.year = year;
    }

    //generic create() method
    public static Exercise14CarExample create(String brand, int year){
        return new Exercise14CarExample(brand, year);
    }
    public static void main(String[] args) {
        //use explicit constractor 
        Exercise14CarExample eCarExam = new Exercise14CarExample("BMW", 2001);
        System.out.println(eCarExam.car + " " + eCarExam.year);

        //use the generic create() method
        Exercise14CarExample eCE = Exercise14CarExample.create("Bagdadi", 2022);
        System.out.println(eCE.car+" "+ eCE.year);

    }
}
 */

 /**
  * Exercise14CarExample
  */
 public class Exercise14 {
 
    public static void main(String[] args) {
        Generator<CountedObject> gen = new BasicGenerator<CountedObject>(CountedObject.class);
        for(int i = 0; i <= 5; i++){
            System.out.println(gen.next());
        }
    }
 }