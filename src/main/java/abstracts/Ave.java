package abstracts;

public abstract class Ave extends Animal {
    protected abstract boolean feathers();
    protected void fly(){
        System.out.println(name + " takes flight.");
    }
}
