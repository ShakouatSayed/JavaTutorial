package type_information.Generic_class_references;

class Building{}
class House extends Building{}

public class Example06 {
    public static void main(String args[]){
        Building b = new House();
        Class<House> building = House.class;

        House h = building.cast(b);
        h = (House)b;
        System.out.println(h); 
    }
}
