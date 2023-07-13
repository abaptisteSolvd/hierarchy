package enums;

import abstracts.Animal;
import interfaces.IPoison;

public enum Reptiles {
    BEARDED_DRAGON("Bearded dragon spews blood",2),
    SNAKE("implementations.Snake bites",5);
    int fluidResource;
    String defensiveMeasure;

    Reptiles (String defensiveMeasure, int fluidResource){
        this.fluidResource = fluidResource;
        this.defensiveMeasure = defensiveMeasure;
    }

    IPoison inject = (Animal animal) -> {System.out.println("implementations.Snake bites "+animal.getName());}; {fluidResource--;}

}
