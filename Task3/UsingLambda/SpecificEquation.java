package Task3.UsingLambda;

public class SpecificEquation {

    public static void main(String[] args) {
        System.out.println(Solver.solve(-10, 10, 0.000001, x -> 6 * x - 12));

    }
}


