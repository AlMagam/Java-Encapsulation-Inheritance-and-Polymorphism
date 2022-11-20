package Task3.AbstractAndDerivedClasses;

public class Equation extends AbstractEquation {
    @Override
    public double f(double x) {
        return 6 * x - 12;
    }

    public static void main(String[] args) {
        System.out.println(new Equation().solve(-10, 10, 1));
    }
}
