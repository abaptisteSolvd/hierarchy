package designpatterns;

import abstracts.Animal;
import implementations.Owner;

public class OwnerFactory extends AbstractFactory{
    public Owner getOwner(int id){
        return new Owner(id);
    }

    @Override
    public Animal getAnimal(String species) {
        return null;
    }
}
