/* How to create Multiple class in java Program */
package problem_solving_question;

class Add{
    int a = 5, b = 10, result;
    void add(){
        result = a + b;
        System.out.println(result);
    }
}

class Multiplication{
    int mul (int a, int b){
        int res = a * b;
        return res;
    }
}

public class MultipleClass {
    public static void main(String[] args) {
        Add a = new Add();
        Multiplication m = new Multiplication();
        a.add();
        //int b = m.mul(2, 5);
        System.out.println(m.mul(2, 5));
    }
}
