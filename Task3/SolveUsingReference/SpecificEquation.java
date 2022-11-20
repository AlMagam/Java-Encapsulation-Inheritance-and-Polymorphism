package Task3.SolveUsingReference;

public class SpecificEquation {
    public static double f(double x) {
        return  6 * x - 12;
    }
    public static void main(String[] args) {
        System.out.println(Solver.solve(-10, 10, 0.000001, SpecificEquation::f));
    }
}


