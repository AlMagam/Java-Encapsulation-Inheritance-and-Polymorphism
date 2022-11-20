package lab;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Triangle[] triangles = new Triangle[]{
                new Triangle(6, 10, 8),
                new Triangle(5,3, 4),
                new Triangle(17, 15, 8),
        };
        System.out.println("Triangles arr:");
        System.out.println(Arrays.toString(triangles));

        Arrays.sort(triangles, new CompareBySquare());

        System.out.println("\nSorting by area (from the biggest to lowest):");
        System.out.println(Arrays.toString(triangles));
    }
}


