package lab;

public class Human {
    private String name;

    public Human(String name){
        this.name = name;
    }
    public String getName(){return "Name: " + name + "\t";}
    @Override
    public String toString() {
        return getName();
    }
}
