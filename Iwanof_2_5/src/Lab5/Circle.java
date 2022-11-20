package Lab5;

public class Circle implements Comparable<Circle>{
    private double radius;
    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public int compareTo(Circle o) {
        return Double.compare(getRadius(), o.getRadius());
    }

}
