/* Exercise 28: (4) Create a generic class Generic1<T> with a single method that takes an
argument of type T. Create a second generic class Generic2<T> with a single method that
returns an argument of type T. Write a generic method with a contravariant argument of the first
generic class that calls its method. Write a second generic method with a covariant argument of
the second generic class that calls its method. Test using the typeinfo.pets library.  */

package generics.Wildcards;

import type_information.pets.Checking_before_cast.pets_animals.*;

/* class Generic1<T> {
  private T t;
    void set(T t){
      this.t= t;
  }
}

class Generic2<T>{
  private T t;
  T get(){
      return t;
  }
}

public class Exercise28 {
  static <T> void covarientWriting(Generic1<? super T> list, T iteam){
    list.set(iteam);
  }

  static <T> T covarientReading(Generic2<? extends T> list){
    return list.get();
  }

  public static void main(String[] args) {
    Generic1<Rodent> petGeneric1 = new Generic1<>();
    covarientWriting(petGeneric1, new  Mouse());

    Generic2<Ret> individuelGeneric2 =new Generic2<>();
    Ret ret = covarientReading(individuelGeneric2);
    System.out.println(ret);

    Generic2<Cat> individuelGeneric3 = new Generic2<>();
    Cat cat = covarientReading(individuelGeneric3);
    System.out.println(cat);
  }
}
 */

/**
 * Exercise28
 */
public class Exercise28 {
  class Generic1<T> {
    T t;

    public void get(T t) {
      this.t = t;
    }
  }

  class Generic2<T> {
    T t;

    public T set() {
      return t;
    }
  }

  static <T> void f1(Generic1<? super T> list, T iteam) {
    list.get(iteam);
  }

  static <T> T f2(Generic2<? extends T> list) {
    return list.set();
  }

  public static void main(String[] args) {
    Exercise28 ex = new Exercise28();
    //ex.f1( ,new Generic1<IndividualPet>());
    f1(ex.new Generic1<Rodent>(), new Mouse());
    f2(ex.new Generic2<Cat>());
    //Exercise28.f2(new Generic2<Cat>());
  }
}
