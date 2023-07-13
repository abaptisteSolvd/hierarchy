package abstracts;

public abstract class Mammal extends Animal{
    protected int furDensity = 5;
    protected final boolean warmBlooded = true;
    protected abstract void fur();
    public boolean givesLiveBirth(){
        return true;
    }
}
