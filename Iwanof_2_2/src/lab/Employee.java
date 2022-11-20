package lab;

public class Employee extends Citizen {
    private String company;

    public Employee(String name, String nationality, String company){
        super(name,nationality);
        this.company = company;
    }
    public String getCompany(){return "Company: " + company + "\t";}
    @Override
    public String toString(){
        return getName() + getNationality() + getCompany();
    }
}
