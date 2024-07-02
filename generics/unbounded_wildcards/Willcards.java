package generics.unbounded_wildcards;

import generics.Wildcards.Holders;

public class Willcards {
    static void rawArgs(Holders holders, Object arg) {
        /// holders.setHolders(arg);
        // holders.setHolders(new Willcards());
        Object obj = holders.getHolders();
    }

    static void unboundedArgs(Holders holders, Object arg) {
        /// holders.setHolders(arg);
        // holders.setHolders(new Willcards());
        // T t = holders.getHolders();
        Object obj = holders.getHolders();
    }

    static <T> T extect1(Holders<T> holders) {
        T t = holders.getHolders();
        return t;
    }

    static <T> T extect2(Holders<T> holders, T arg) {
        holders.setHolders(arg);
        T t = holders.getHolders();
        return t;
    }

    static <T> T wildSubTypes(Holders<? extends T> holders, T args) {
        // holders.setHolders(args);
        T t = holders.getHolders();
        return t;
    }

    @SuppressWarnings("unchecked")
    static <T> void wildSuperTypes(Holders<? super T> holders, T args) {
        holders.setHolders(args);
        Object obj = holders.getHolders();
        //return t;
    }

    public static void main(String[] args) {
        Holders raw = new Holders<Long>();
        raw = new Holders();
        Holders<Long> qualifieds = new Holders<>();
        Holders<?> unbounded = new Holders<Long>();
        Holders<? extends Long> bounded = new Holders<>();
        Long lng = 1L;

        rawArgs(raw, lng);
        rawArgs(qualifieds, lng);
        rawArgs(unbounded, lng);
        rawArgs(bounded, lng);
    
        unboundedArgs(raw, lng);
        unboundedArgs(qualifieds, lng);
        unboundedArgs(unbounded, lng);
        unboundedArgs(bounded, lng);

        //Long r1 = extect1(raw);
        Long r2 = extect1(qualifieds);
        System.out.println(r2);
        Object r3 =  extect1(unbounded);
        System.out.println(r3);
        Long r4 = extect1(bounded);
        System.out.println(r4);

        //Long r5 = extect2(raw, lng);
        Long r6 = extect2(qualifieds, lng);
        System.out.println(r6);
        //Object r7 = extect2(unbounded, lng);
        //Long r8 = extect2(bounded, lng);

        //Long r9 = wildSubTypes(raw, lng);
        Long r10 = wildSubTypes(qualifieds, lng);
        System.out.println(r10);
        Object r11 = wildSubTypes(unbounded, lng);
        System.out.println(r11);
        Long r12 = wildSubTypes(bounded, lng);
        System.out.println(r12);

        //Long r13 = wildSuperTypes(raw, lng);
        wildSuperTypes(qualifieds, lng);
        //Object r15 = wildSuperTypes(unbounded, lng);
        //Long r16 = wildSuperTypes(bounded, lng);
    }
}
