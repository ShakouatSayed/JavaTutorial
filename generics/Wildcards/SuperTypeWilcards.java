package generics.Wildcards;

import java.util.*;

public class SuperTypeWilcards {
    static void writeTo(List<? super Apple> apple){
        apple.add(new Apple());
        apple.add(new Shakouat());
    }
}
