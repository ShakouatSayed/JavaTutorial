package problem_solving_question;

public class SwapVariableUseThirdVariable {
    public static void main(String[] args) {
        int a = 10, b = 30, temp;

        temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}
