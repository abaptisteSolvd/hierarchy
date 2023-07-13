package enums;

import abstracts.Animal;
import interfaces.IConsume;

public enum Amphibians {
    FROG(4), NEWT(3), TURTLE(10), CROC(7);
    int lungCapacity;

    Amphibians (int lungCapacity){
        this.lungCapacity = lungCapacity;
    }

    IConsume eat = (Animal animal) -> System.out.println(this.name() + " bites "+animal.getName());
}
