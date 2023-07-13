package abstracts;

public abstract class Insect extends Animal{
    protected int legs = 6;
    public boolean hasLungs(){
        return false;
    }
    public void move(){
        System.out.println(name+" is crawling");
    }

    public abstract void eat(Animal food);
}
