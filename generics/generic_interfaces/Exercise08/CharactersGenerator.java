package generics.generic_interfaces.Exercise08;

import java.util.Iterator;
import java.util.Random;

public class CharactersGenerator implements GeneratorOne<StoryCharacters>, Iterable<StoryCharacters>{
    private Class type[] = {PreJeoBiaden.class, PreJosBoss.class, PreNetaniyahu.class, PreSaddam.class, PreMayamurGaddafi.class, SultanAbdulHamid.class};

    public static Random rand = new Random(47);
    private int size = 0;
    public CharactersGenerator(int size ){this.size = size;}
    public CharactersGenerator(){}

    public StoryCharacters next(){
        try{
            return (StoryCharacters) type[rand.nextInt(type.length)].newInstance();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    class CharacterIterator implements Iterator<StoryCharacters>{
        int count = size;
        public boolean hasNext(){return count>0;}
        public StoryCharacters next(){
            count--;
            return CharactersGenerator.this.next();
        }
    }

    public void remove(){
        throw new UnsupportedOperationException();
    }

    public Iterator<StoryCharacters> iterator(){
        return new CharacterIterator();
    }

    public static void main(String[] args) {
        CharactersGenerator cG = new CharactersGenerator();
        for(int i = 0; i < 10; i++){
            System.out.println(cG.next() + " ");
        }
        for(StoryCharacters s: new CharactersGenerator(10)){
            System.out.println(s+" ");
        }
    }
}
