package lab;

import static java.lang.Math.cos;

public class Main {
    static class IntegrRectangleTest implements Integrable{
        @Override
       /* public double f(double num) {
            return 6 * num + 3 + num;
        }*/
        public double f(double num) {
            return cos(num);
        }
    }
    public static void main(String[] args) {
        System.out.printf("Integraled with rectangle method :\n" +
                "Function cos(x) :\tResult : "
        );
        IntegrRectangleTest recTest = new IntegrRectangleTest();
        System.out.println(recTest.integral(-4, 10, 0.00001));

        integrableTrapezoid integrableTrapezoid = new integrableTrapezoid();
        System.out.printf("\nIntegraled with trapezoid method :\n" +
                "Function cos(x) :\tResult : "
        );
        System.out.println(integrableTrapezoid.integral(-4, 10, 0.00001));
    }
}

