package abstracts;

public abstract class Reptile extends Animal{
    private boolean coldBlood;
    private boolean smoothScales;
    protected Reptile(boolean blood, boolean scales){
        this.coldBlood = blood;
        this.smoothScales = scales;
    }
    protected abstract void move();
}
