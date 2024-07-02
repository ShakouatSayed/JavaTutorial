package generics.capture_conversion;

import generics.Wildcards.*;

public class CaptureConversion {
    static <T> void f1(Holders<T> holders){
        T t = holders.getHolders();
        System.out.println(t.getClass().getSimpleName());
    }

    static void f2(Holders<?> holders){
        f1(holders);
    }

    public static void main(String[] args) {
        Holders raw = new Holders<Integer>(1);
        //f1(raw);
        f2(raw);

        Holders<Object> rawBesics = new Holders<Object>();
        rawBesics.setHolders( new Object());
        f1(rawBesics);

        Holders<?> doublsHolders = new Holders<Double>(3.1416);
        f2(doublsHolders);


    }
}
