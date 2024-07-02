/*
 * Thinking in Java.
 * Exercise Solution 09:
 * 
 * Exercise 9: Modify the previous exercise so that it uses
 * Class.getDeclaredFields() to also display information about the fields in a
 * class.
 */

 package type_information.need_runtimeinformation;

 class A1{
    int a;
    float b;
 }

 
 class B1 extends A1{
    String s;
    char c;
 }

 
 class C1 extends B1{
    long l;
    double d;
 }


 public class Exercise09{
    public static void hierarchy(Object o){
        Object[] fields = o.getClass().getDeclaredFields();

        if(fields.length == 0)
            System.out.println(o.getClass()+"Have no fileds. ");
        if(fields.length > 0)
            System.out.println("Fields () "+o.getClass()+" : \n");
            for(Object obj : fields)
                System.out.println(obj);
        
        if(o.getClass().getSuperclass() != null){
            System.out.println(o.getClass()+" GET the Class: "+o.getClass().getSuperclass());
            try{
                hierarchy(o.getClass().getSuperclass().newInstance());
            }catch(InstantiationException e){
                System.out.println("Unable to instant the class.");
            }catch(IllegalAccessException e){
                System.out.println("Can not access the class.");
            }
        }
    }
    public static void main(String arg[]){
        hierarchy(new C1());
    }
 }