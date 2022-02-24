package Inheritance.CodeExamples;


class A3{
    A3(){
        System.out.println("A3");
    }
    public void method1(){
        System.out.println("Working in A");
    }
}

class B3 extends A3{
    B3(){
        System.out.println("B3");
    }

   @Override
    public void method1() {
//        super.method1();
        System.out.println("Working in B");
    }
}

public class Example3 {
    public static void main(String[] args) {
        B3 b = new B3();
        b.method1();
    }
}
