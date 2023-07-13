package implementations;

import abstracts.Animal;
import abstracts.Mammal;
import interfaces.IConsume;
import interfaces.IMovement;
import interfaces.IMultiply;
import interfaces.IShead;

public class Dog extends Mammal implements IConsume, IMovement, IMultiply, IShead {
    public Dog(){
        this.name = "Dog";
    }
    public Dog(String name){
        this.name = name;
    }

    public Dog(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public void sound() {
        System.out.println(name + " is barking.");
    }

    public void fur() {
        System.out.println(name + " has shaggy fur.");
    }

    @Override
    public String toString(){
        return this.name + " is a good boy/girl.";
    }
    @Override
    public boolean equals(Object object){
        return this.toString().equals(object.toString());
    }
    @Override
    public int hashCode(){
        int hash = 5;
        hash = 31 * hash + this.name.hashCode();
        return hash;
    }

    @Override
    public void eat(Animal food) {
        System.out.println(this.name +" bites " + food.getName());
    }

    @Override
    public int forward() {
        position += 3;
        return position;
    }

    @Override
    public int backward() {
        position -= 3;
        return position;
    }

    @Override
    public Animal birth(String name) {
        return new Dog(name);
    }

    @Override
    public int shead() {
        return --furDensity;
    }
}
