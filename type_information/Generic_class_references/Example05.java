package type_information.Generic_class_references;

public class Example05 {
    public static void main(String args[])throws Exception{
        //this is the type casting.
        Class <FancyToys> fuClass = FancyToys.class;
        FancyToys fancyToy = fuClass.newInstance();
        Class <? super FancyToys> fClass = fuClass.getSuperclass();

        //This won't compile.
        //Class <Toy> up2 = fuClass.getSuperclass().
        //only product Object.
        Object obj = fuClass.newInstance();
        System.out.println(obj);

    }
}
