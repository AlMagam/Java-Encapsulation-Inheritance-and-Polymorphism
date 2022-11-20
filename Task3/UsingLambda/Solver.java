package Task3.UsingLambda;

public interface Solver {
    double f(double x);
    public static double solve(double startValue, double endValue, double eps, Solver s) {
        double min = startValue;
        for (double i = startValue; i < endValue; i+= eps) {
            double temp = s.f(i);
            if(temp < min)
                min = temp;
        }
        return min;
    }
}
