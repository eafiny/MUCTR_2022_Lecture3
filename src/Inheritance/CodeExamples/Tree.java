package Inheritance.CodeExamples;

public class Tree{
    private void grow(){
        System.out.println("Tree's growing");
    }

    public static void main(String[] args) {
        Birch tree = new Birch();
        tree.grow();
    }
}

class Birch extends Tree {
    protected void grow(){
        System.out.println("Birch's growing");
    }
}
