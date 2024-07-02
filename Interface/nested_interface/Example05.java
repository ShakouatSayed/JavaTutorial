// package nested_interface;

// interface InterFa {
// interface InterFb {
// public void method1();
// }
// }

// // abstract class InterfaClass implements InterFa.InterFb {
// // public void method2() {
// // int a = 10;
// // int b = 20;
// // if (a > b) {
// // System.out.println("A: " + a);
// // } else {
// // System.out.println("B: " + b);
// // }
// // }
// // }

// class InterfaClass1 implements InterFa.InterFb {

// public void method1() {
// System.out.println("this is class of the inheritance class.");
// }

// public int exchangeNumber(int a, int b) {
// int i;
// for (i = 0; i < 10; i++) {
// i = i + a;
// a = b + i;
// }
// return a;
// }
// }

// public class Example05 {
// public static void main(String args[]) {
// System.out.println("This is the Print Line.");
// InterfaClass1 OB1 = new InterfaClass1();
// OB1.method1();
// int num = OB1.exchangeNumber(10, 20);
// System.out.println(num);
// /// InterFa.InterFb OB1;

// }
// }
