package Task3.AbstractAndDerivedClasses;

public abstract class AbstractEquation {
    public abstract double f(double x);

    public double solve(double startValue, double endValue, double eps) {
        double min = startValue;
        for (double i = startValue; i < endValue; i+= eps) {
            double temp = f(i);
            if(temp < min)
                min = temp;
        }
        return min;
    }


}
