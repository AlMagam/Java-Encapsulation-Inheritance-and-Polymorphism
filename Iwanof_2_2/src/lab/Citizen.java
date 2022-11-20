package lab;

public class Citizen extends Human {
    private String nationality;
    public Citizen(String name , String nationality){
        super(name);//для передачі параметрів конструктору базового класу.
        this.nationality = nationality;
    }
    public String getNationality(){return "Nationality: " + nationality + "\t";}
    @Override
    public String toString(){
        return getName() + getNationality();
    }
}
