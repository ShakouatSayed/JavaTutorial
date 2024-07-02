package type_information.Interfaces_and_type_information;

import java.lang.reflect.Field;

class WithPrivateFinalField{
    private int i =   1;
    private final String str = "I'm a Software Engenieer. I love Programming Langauge. This data totally safe.";
    private String strOne = "This data is safe.";
    public String toString(){
        return " i =  "+ i + ", " + str + ", " + strOne;
    }
}

public class Example05 {
    public static void main(String[] args) throws Exception {
        WithPrivateFinalField wPFF = new WithPrivateFinalField();
        
        System.out.println(wPFF);
        Field f = wPFF.getClass().getDeclaredField("i");
        f.setAccessible(true);
        System.out.println("f.getInt(wPFF) : "+f.getInt(wPFF));
        f.setInt(wPFF, 47);

        System.out.println(wPFF);
        f = wPFF.getClass().getDeclaredField("str");
        f.setAccessible(true);
        System.out.println("f.get(wPFF) : "+f.get(wPFF));
        f.set(wPFF, "Your data are not safe.  ");
        
        System.out.println(wPFF);
        f = wPFF.getClass().getDeclaredField("strOne");
        f.setAccessible(true);
        System.out.println("f.get(wPFF) : "+f.get(wPFF));
        f.set(wPFF, "Your data is not here.");

        System.out.println(wPFF);
    }
}
