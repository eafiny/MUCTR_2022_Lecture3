package Inheritance.CodeExamples;


class A2{
    int a;
    A2(int a){
        this.a = a;
        System.out.println("A2");
    }
}

class B2 extends A2{
    int b;
    B2(int a, int b){
        super(a);
        this.b = b;
        System.out.println("B2");
    }
}

public class Example2 {
    public static void main(String[] args) {
        B2 b = new B2(2,4);
    }
}
