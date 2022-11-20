package lab;

class Triangle {
    private double a, b, c;
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getSquare() {
        return Math.sqrt((a + b + c) * (b + c - a) * (a + c - b) * (a + b - c)) * 0.25 ;
    }

    @Override
    public String toString() {
        return "Triangle with sides: " + this.a +" " + this.b + " " + this.c + " have square :" + getSquare() +"\n";
    }
}
