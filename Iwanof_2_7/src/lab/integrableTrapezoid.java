package lab;

import static java.lang.Math.cos;

public class integrableTrapezoid implements Integrable {
    @Override
    public double f(double num) {
        return cos(num);
    }
    /*public double f(double num) {
        return sin(num);...
    }*/
    @Override
    public double integral(double start, double end, double precision) {
        double firstUndLast = 0;
        double general = 0;
        for (double num = start; num <= (end + precision * 0.1); num += precision) {
            if (num == start || num + precision > (end + precision * 0.1))
                firstUndLast += f(num);
            else general += f(num);
        }
        return precision * (firstUndLast / 2 + general);
    }
}

