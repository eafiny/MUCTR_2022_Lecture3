package Inheritance.Animals;

import Interfaces.Man;
import Interfaces.Soundable;

abstract class Animal implements Soundable {
    String name;
    int age;

    void eat(){

    }
    public abstract void getVoice();
}

class Dog extends Animal{
    private String breed = "Retriever";

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void chaseACat(){
        System.out.println("Chasing a cat");
    }

//    @Override
    public void getVoice() {
        System.out.println("Gav");
    }
}

class Cat extends Animal{
//    @Override
    public void getVoice() {
        System.out.println("Meou");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.chaseACat();

        Animal animal1 = new Dog();
        animal1.getVoice();
//        Animal animal2 = new Cat();
//        animal1.getVoice();
//        animal2.getVoice();

        Animal[] animals = new Animal[]{new Dog(), new Cat()};
        for (Animal a:animals) {
            a.getVoice();
        }

        Soundable[] myArray = new Soundable[]{new Dog(), new Cat(), new Man()};
        for (Soundable s: myArray) {
            s.getVoice();
        }
    }
}
