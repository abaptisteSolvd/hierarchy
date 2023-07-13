package interfaces;
import abstracts.Animal;
public interface IPoison {
    String type = "neuro";
    void inject(Animal animal);
}
