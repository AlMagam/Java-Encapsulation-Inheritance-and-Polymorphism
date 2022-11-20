package Task3.InterfaceAndAnonymousClasses;

public class SpecificEquation {

    public static void main(String[] args) {
        System.out.println(Solver.solve(-10, 10, 0.000001, new Solver() {
            @Override
            public double f(double x) {
                return 6 * x - 12;
            }
        }));
    }

}


