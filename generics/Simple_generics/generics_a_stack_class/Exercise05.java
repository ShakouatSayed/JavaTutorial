/* Exercise 5: (2) Remove the type parameter on the Node class and modify the rest of the
code in LinkedStack.java to show that an inner class has access to the generic type
parameters of its outer class. */

package generics.Simple_generics.generics_a_stack_class;

public class Exercise05<T> {
    private class NodeOne{
        T iteam;
        NodeOne next;

        public NodeOne(T iteam, NodeOne next){this.iteam = iteam; this.next = next;}
        public boolean end(){return iteam == null && next == null;}

    }

    private NodeOne top = new NodeOne(null, null);

    public void push(T iteam){
        top = new NodeOne(iteam, top);
    }

    public T pop(){
        T result = top.iteam;
        if(!top.end()){
            top = top.next;
        }
        return result;
    }

    public static void main(String[] args) {
        Exercise05<String> ex = new Exercise05<String>();
        for(String s: "Shakouat Hossen Sayed".split(" "))
            ex.push(s);
        
        String s;
        while((s=ex.pop()) != null)
            System.out.println(s);
    }
}
