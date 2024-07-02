package generics.compensating_for_erasure.creating_instances_of_types;


class ClassAsFactory<T>{
    T x;
    @SuppressWarnings("deprecation")
    public ClassAsFactory(Class<T> kind){
        try{
            x = kind.newInstance();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}     

class Employee{}

public class InstantiateGenericType {
    public static void main(String[] args) {
        ClassAsFactory<Employee> newInstant = new ClassAsFactory<Employee>(Employee.class);
        System.out.println("ClassAsFactory<Employee> succeeded");
        ClassAsFactory<Integer> newInstantOne = new ClassAsFactory<Integer>(Integer.class);
        System.out.println("ClassAsFactory<Employee> field");
    }
}
