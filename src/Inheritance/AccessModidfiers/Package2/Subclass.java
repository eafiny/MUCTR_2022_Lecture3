package Inheritance.AccessModidfiers.Package2;

import Inheritance.AccessModidfiers.Package1.Superclass;

public class Subclass extends Superclass {
    public static void main(String[] args) {
        Superclass obj = new Superclass();
//        obj.method1();
        Subclass obj1 = new Subclass();
        obj1.method1();
    }
}
