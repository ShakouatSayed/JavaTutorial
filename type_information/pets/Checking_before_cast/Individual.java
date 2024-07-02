package type_information.pets.Checking_before_cast;

public class Individual implements Comparable<Individual> {

    private int count  = 0;
    private int id = count++;
    private String name;

    //Example01 constractor 
    public Individual(String name){
        this.name = name;
    }

    //Example01 constractor02
    public Individual(){};

    // toString method and return type String
    public String toString(){
        return getClass().getSimpleName()+(name != null ? "" : " " +name);
    }

    //id method and return type long.
    public long id(){
        return id;
    }

    //equels method and return type is boolean
    public boolean equels(Object obj){
        return obj instanceof Individual && id ==((Individual)obj).id; 
    }

    //hasCode method and return type is int
    public int hasCode(){
        int num = 17;
        int result;
        if(name != null)
            result = 37 * num + name.hashCode();
        result = 37 * num +(int)id;
        return result;
    }

    //compareTo method and return type is int. 
    public int compareTo(Individual arg){
        String first = getClass().getSimpleName();
        String arg_first = arg.getClass().getSimpleName();
        int compare_string = first.compareTo(arg_first);
        if(compare_string != 0)
            return compare_string;
        if(name != null && arg.name != null){
            int second_compare_string = name.compareTo(arg_first);
            if (second_compare_string != 0) {
                return second_compare_string;
            }
        }
        return (arg.id < id ? -1 : (arg.id == id ? 0 : 1));
    }
}
