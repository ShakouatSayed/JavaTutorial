
/* Exercise 8: (2) Following the form of the Coffee example, create a hierarchy of
StoryCharacters from your favorite movie, dividing them into GoodGuys and BadGuys.
Create a generator for StoryCharacters, following the form of CoffeeGenerator.  */

package generics.generic_interfaces.Exercise08;

public class StoryCharacters {
    private static long count = 0;
    private final long id = count++;
    public String toString(){
        return getClass().getSimpleName()+"\t"+ id;
    }
}
