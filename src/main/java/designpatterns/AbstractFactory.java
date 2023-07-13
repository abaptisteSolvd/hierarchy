package designpatterns;

import abstracts.Animal;
import implementations.Owner;

public abstract class AbstractFactory {
    abstract Owner getOwner(int id);
    public abstract Animal getAnimal(String species);
}
