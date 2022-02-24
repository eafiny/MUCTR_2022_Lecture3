package Inheritance.CodeExamples;

class A7{
    String str;

    public A7() {
        greet();
    }

    void greet(){
        System.out.println(str);
    }
}

public class Example7 extends A7{
    String str = "Hello!";

    @Override
    void greet() {
        System.out.println(str);
    }

    public static void main(String[] args) {
        A7 myObj = new Example7();
    }
}
