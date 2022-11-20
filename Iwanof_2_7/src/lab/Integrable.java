package lab;

public interface Integrable {
    double f(double num);
    default double integral(double start, double end, double precision) {
        /*int h = (int)((end - start) / precision);*/
        double sum = 0;
        for (double num = start + precision / 2; num <= (end + precision * 0.1); num += precision)
            sum += f(num);
        return sum * precision;
    }
}


