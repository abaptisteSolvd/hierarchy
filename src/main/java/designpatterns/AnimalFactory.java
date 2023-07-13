package designpatterns;

import abstracts.Animal;
import implementations.*;

public class AnimalFactory extends AbstractFactory{
    @Override
    Owner getOwner(int id) {
        return null;
    }

    public Animal getAnimal(String species){
        if(species == null) {
            return null;
        } else if(species.equalsIgnoreCase("Dog")){
            return new Dog();

        } else if(species.equalsIgnoreCase("Snake")){
            return new Snake();

        } else if(species.equalsIgnoreCase("Platypus")){
            return new Platypus();

        } else if(species.equalsIgnoreCase("Ostrich")){
            return new Ostrich();

        } else if(species.equalsIgnoreCase("Centipede")){
            return new Centipede();

        }

        return null;
    }
}
