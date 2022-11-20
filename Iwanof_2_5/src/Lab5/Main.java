package Lab5;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Circle[] circles = {new Circle(4.32),new Circle(5.62),new Circle(2.91),new Circle(1.25)};
        System.out.println("Our Circles:");

        for (int i = 0; i < circles.length; i++){
            System.out.printf("Radius %f \t", circles[i].getRadius());
        }
        Arrays.sort(circles);

        System.out.println("\n\nCircles sorted by radius:");
        for (int i = 0; i < circles.length; i++){
            System.out.printf("Radius %f \t", circles[i].getRadius());
        }

    }
}
