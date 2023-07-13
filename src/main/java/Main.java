import designpatterns.AbstractFactory;
import designpatterns.FactoryGenerator;
import designpatterns.HomeBuilder;
import implementations.Dog;
import implementations.Home;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static final Logger LOGGER = LogManager.getLogger("Main");
    public static void main(String[] args) {
        LOGGER.info("Hierarchy");

        AbstractFactory AnimalFactory = FactoryGenerator.getFactory("Animal");
        Dog dog1 = (Dog) AnimalFactory.getAnimal("Dog");
        dog1.sound();
        dog1.setName("Tiny");

        HomeBuilder builder = new HomeBuilder();

        Home home = builder.withOwner("John Doe", "1234 PlaceName").withPet("Dog",
                dog1.getName()).build();
        System.out.println(home.toString());
        LOGGER.info(home.toString());
    }


}