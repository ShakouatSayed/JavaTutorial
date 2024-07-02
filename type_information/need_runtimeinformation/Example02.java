package type_information.need_runtimeinformation;

class Candy{
    static {
        System.out.println("Candy\n");
    }
}

class Gum{
    static {
        System.out.println("Gum\n");
    }
}

class Cookie{
    static {
        System.out.println("Cookie\n");
    }
}

public class Example02 {
    
    public static void main(String args[]){
         Class c = null;
        System.out.println("Candy method calling.");
        new Candy();
        try{
            c = Class.forName( "Gum");
        }catch(ClassNotFoundException e){
            System.out.println("class not found ....\n");
        }
        System.out.println("Class.forname(\"Gum\")\n");
        new Cookie();
    }
}
