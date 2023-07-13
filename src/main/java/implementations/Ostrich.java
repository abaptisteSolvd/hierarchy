package implementations;

import abstracts.Animal;
import abstracts.Ave;
import interfaces.IConsume;
import interfaces.IMovement;
import interfaces.IMultiply;

public class Ostrich extends Ave implements IMovement, IConsume, IMultiply {
    public Ostrich(){
        this.name = "ostrich";
    }
    public Ostrich(String name){
        this.name = name;
    }

    public Ostrich(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public boolean feathers() {
        return true;
    }
    public void sound() {
        System.out.println(name + " is chirping");
    }

    @Override
    public void fly(){
        System.out.println(name + " can't fly.");
    }

    @Override
    public void eat(Animal food) {
        System.out.println(this.name +" pecks " + food.getName());
    }

    @Override
    public int forward() {
        position += 5;
        return position;
    }

    @Override
    public int backward() {
        position -= 5;
        return position;
    }

    @Override
    public Animal birth(String name) {
        return new Ostrich(name);
    }
}
