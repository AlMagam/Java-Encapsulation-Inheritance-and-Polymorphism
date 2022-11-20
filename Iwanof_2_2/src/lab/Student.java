package lab;

public class Student extends Citizen{
    private String university;

    public Student (String name , String nationality, String university){
        super(name,nationality);
        this.university = university;
    }
    public String getUniversity(){return "University: " + university + "\t";}
    @Override
    public String toString(){
        return getName() + getNationality() + getUniversity();
    }
}
