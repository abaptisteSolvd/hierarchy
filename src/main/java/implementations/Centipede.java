package implementations;

import abstracts.Animal;
import abstracts.Insect;
import interfaces.IConsume;
import interfaces.IMovement;
import interfaces.IMultiply;
import interfaces.IPoison;

public final class Centipede extends Insect implements IConsume, IMultiply, IMovement, IPoison {
    public Centipede(){
        this.legs = 100;
        this.name = "centipede";
    }

    public Centipede(String name){
        this.legs = 100;
        this.name = name;
    }

    public Centipede(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    protected void sound() {
        System.out.println("...");
    }

    @Override
    public String toString(){
        return this.name + " is ew.";
    }
    @Override
    public boolean equals(Object object){
        return hashCode() == object.hashCode();
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
    public void inject(Animal target) {
        this.eat(target);
        System.out.println(target.getName() + " is affected by " + type + " toxin");
    }

    @Override
    public int forward() {
        return ++position;
    }

    @Override
    public int backward() {
        return --position;
    }

    @Override
    public Animal birth(String name) {
        return new Centipede(name);
    }
}
