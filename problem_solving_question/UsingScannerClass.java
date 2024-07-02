package problem_solving_question;

import java.util.Scanner;

public class UsingScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        byte by;
        double d;
        float f;
        char c;
        boolean b;

        System.out.print("\n"+"Enter the an Integer = ");
        i = sc.nextInt();
        System.out.print("The Integer is = "+i);

        System.out.print("\n"+"\n"+"Enter the a Byte vlaue = ");
        by = sc.nextByte();
        System.out.print("The Byte vlaue is = "+by);
        
        System.out.print("\n"+"\n"+"Enter the a Double value = ");
        d = sc.nextDouble();
        System.out.print("The Double value is = "+d);

        System.out.print("\n"+"\n"+"Enter the a Float value = ");
        f = sc.nextFloat();
        System.out.print("The Float value is = "+f);

        System.out.print("\n"+"\n"+"Enter the a Charecter value = ");
        c = sc.next().charAt(0);
        System.out.print("The Charecter value is = "+c);

        System.out.print("\n"+"\n"+"Enter the a Boolean vlaue = ");
        b = sc.nextBoolean();
        System.out.print("The Boolean vlaue is = "+b);

    }
}
