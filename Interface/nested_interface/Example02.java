package nested_interface;

class Interface02 {
    protected interface Interface03 {
        void method01();
    }
}

class Interface04 implements Interface02.Interface03 {
    public void method01() {
        System.out.println("This is the nested interface example 2.");
    }
}

class A0 {
    public static void main(String args[]) {

        Interface02.Interface03 obj;
        Interface04 OB2 = new Interface04();
        obj = OB2;
        obj.method01();
    }
}