package generics.generic_methods.general_purpose_generator;

import generics.generic_interfaces.coffee.Generator;

public class BasicGenerator<T> implements Generator<T> {
    private Class<T> type;
    public BasicGenerator(Class<T> type) {this.type = type;}

    @SuppressWarnings("deprecation")
    public T next(){
        try{
            //assumes type is a public class
            return type.newInstance();
        }catch(Exception e){
            throw new RuntimeException();
        }
    }

    //produce a defult generator given a type token
    public static <T> Generator<T> create(Class<T> type){
        return new BasicGenerator<T>(type);
    }
}
