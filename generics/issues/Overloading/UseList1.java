package generics.issues.Overloading;

import java.util.*;

 class UseList1<W, T> {
     void f1(List<W> val){}
     void f1(List<T> val, List<W> val1){}
}

class UseList2<W, T>{
    public void f2(List<W> val){}
    public void f3 (List<T> val){}
}
