package abstracts;

public abstract class Animal {
    public Animal setName(String name) {
        this.name = name;
        return this;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    protected String name;
    protected int age;
    static String owner;

    protected int position = 0;
    protected abstract void sound();
    public final String getName(){
        return name;
    }

    static void pet(Animal animal){
        System.out.println("you pet " + animal.getName());
    }
}
