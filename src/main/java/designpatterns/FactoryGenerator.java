package designpatterns;

public class FactoryGenerator {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Owner")){
            return new OwnerFactory();

        }else if(choice.equalsIgnoreCase("Animal")){
            return new AnimalFactory();
        }

        return null;
    }
}
