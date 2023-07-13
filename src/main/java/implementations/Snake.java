package implementations;

import abstracts.Animal;
import abstracts.Reptile;
import interfaces.IConsume;
import interfaces.IMovement;
import interfaces.IMultiply;
import interfaces.IShead;

public class Snake extends Reptile implements IMovement, IConsume, IMultiply, IShead {
    public Snake(){
        super(true, true);
        this.name = "implementations.Snake";
    }
    public Snake(String name){
        super(true, true);
        this.name = name;
    }

    public Snake(String name, int age) {
        super(true, true);
        this.name = name;
        this.age = age;
    }

    public void move() {
        System.out.println(name + " is slithing");
    }

    public void sound() {
        System.out.println(name + ": Kept you waiting, huh?");
    }

    @Override
    public String toString(){
        return "danger bity jungle noodle";
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
        return new Snake(name);
    }

    @Override
    public int shead() {
        System.out.println(this.name + " skin peels a little.");
        return 0;
    }
}
