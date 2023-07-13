package designpatterns;

import abstracts.Animal;
import implementations.Home;
import implementations.Owner;

import java.util.ArrayList;

public class HomeBuilder {
    private Owner owner;
    private ArrayList<Animal> pets = new ArrayList<>();
    private FactoryGenerator generator = new FactoryGenerator();

    public HomeBuilder withOwner(String name, String address){
        if (name == null || address == null){
            throw new IllegalArgumentException("owner must have a name and address");
        }
        this.owner = generator.getFactory("Owner").getOwner(0).setName(name).setAddress(address);
        return this;
    }

    public HomeBuilder withPet(String species, String name){
        if (species == null || name == null){
            throw new IllegalArgumentException("specify pet's species and name");
        }
        this.pets.add(generator.getFactory("Animal").getAnimal(species).setName(name));
        return this;
    }

    public Home build(){
        return new Home(this);
    }

    public Owner getOwner() {
        return this.owner;
    }

    public String getAddress() {
        return this.owner.getAddress();
    }

    public ArrayList<Animal> getPets() {
        return this.pets;
    }

    public String toString(){
        return "Name: " + getOwner().getName() + "\nAddress: " + getAddress() + "\nPets: " + pets.toString();
    }
}
