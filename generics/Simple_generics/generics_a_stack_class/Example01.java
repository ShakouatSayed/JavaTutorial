package generics.Simple_generics.generics_a_stack_class;

public class Example01<T> {
    private static class Node<U>{
        //declear the one variable U type and node class type object.
        U item ;
        Node<U> next;

        //create a constructor 
        public Node(){item = null; next = null;}
        //public Node(U item, Node<U> next){ this.item = item; this.next = next;}
        //then creat a prameter type constructor
        public Node(U item, Node<U> next){this.item = item; this.next = next; }

        //creating a method and return type is boolean
        public boolean end(){return item == null && next == null;}
    }

    //change the type of node class object this called end sentinel 
    private Node<T> top = new Node<T>();
    private T item;

    //create a method and return type is void and paremeter is T type variable
    public void push(T item){
        //create another object and paremeter is item and top
        //top = new Node<T>(item, top);
        top = new Node<T>(item, top);
    }

    public T pop(){
        T result = top.item;
        if(!top.end()){
            top = top.next;
        }
        return result;
    }

    public static void main(String[] args) {
        Example01<String> ex = new Example01<String>();
        for(String s: "Shakouat Hossen Sayed".split(" "))
            ex.push(s);

        String s;
        while((s = ex.pop()) != null){
            //t = ex.pop();
            System.out.println(s);
        }
    }
}
