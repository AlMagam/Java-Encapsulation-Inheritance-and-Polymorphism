package Task3.InterfaceRealisation;

import Task3.AbstractAndDerivedClasses.Equation;

public class SpecificEquation implements Solver {
    @Override
    public double f(double x) {
        return 6 * x - 12;
    }

    public static void main(String[] args) {
        System.out.println(Solver.solve(-10, 10, 0.00001, new SpecificEquation()));
    }

}



