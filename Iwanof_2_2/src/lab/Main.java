package lab;

public class Main {

    public static void main(String[] args) {
        Human[] humans = { new Human("Edgar"),
        new Citizen("Mark", "Ukrainian"),
        new Student("Viharcho", "Asian", "KHPI"),
        new Employee("Peter","American","Google")};
        for (Human human : humans) {
            System.out.println(human);
    }
    }
}
