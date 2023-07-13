package implementations;

import abstracts.Animal;
import designpatterns.HomeBuilder;

import java.util.ArrayList;

public class Home {
    Owner owner;
    String address;
    ArrayList<Animal> pets;

    public Home(Owner newOwner){
        owner = newOwner;
        address = owner.getAddress();
    }

    public Home(HomeBuilder homeBuilder) {
        this.owner = homeBuilder.getOwner();
        this.address = homeBuilder.getAddress();
        this.pets = homeBuilder.getPets();
    }

    public void addPet(Animal newPet){
        pets.add(newPet);
    }

    public String toString(){
        return "Name: " + owner.getName() + "\nAddress: " + owner.getAddress() + "\nPets: " + pets.toString();
    }
}
