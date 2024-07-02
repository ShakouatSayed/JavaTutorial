package generics.self_bounded_types.self_bounded;

public class SelfBoundGenericMethod <T>{
    static <T extends SelfBounds<T>> T f(T args){return args.set(args).get();} 
    public static void main(String[] args) {
        A a = f(new A());
        System.out.println(a.getClass().getSimpleName());
    }    
}
