package nested_interface;

interface InterFA {
    interface InterFB {
        void testMethod1();
    }
}

class InterFC01 implements InterFA.InterFB {
    public void testMethod1() {
        System.out.println("This method is InterFC01 class.");
    }
}

class B {
    public static void main(String args[]) {
        InterFA.InterFB obj;

        InterFC01 OB1 = new InterFC01();
        obj = OB1;
        obj.testMethod1();
    }
}