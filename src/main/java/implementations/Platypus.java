package implementations;

import abstracts.Animal;
import abstracts.Mammal;
import interfaces.IConsume;
import interfaces.IMovement;
import interfaces.IMultiply;

public class Platypus extends Mammal implements IMultiply, IConsume, IMovement {
    public Platypus(){
        this.name = "Perry";
    }
    public Platypus(String name){
        this.name = name;
    }

    public Platypus(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public void sound() {
        System.out.println(name + " goes brrrr");
    }

    public void fur() {
        System.out.println(name + " has short fur.");
    }
    @Override
    public boolean givesLiveBirth(){
        return false;
    }
    @Override
    public void eat(Animal food) {
        System.out.println(this.name +" pecks " + food.getName());
    }

    @Override
    public int forward() {
        position += 2;
        return position;
    }

    @Override
    public int backward() {
        position -= 2;
        return position;
    }

    @Override
    public Animal birth(String name) {
        return new Platypus(name);
    }
}
