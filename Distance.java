package assignment5.functionalprograms;

import java.util.Scanner;

//3. Write a program Distance.java that takes two integer command-line arguments x
//and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
//formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
public class Distance {
    public void distance() {
        double distance;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of x");
        int x = s.nextInt();
        System.out.println("Enter value of y");
        int y = s.nextInt();


        distance = Math.sqrt(Math.pow(x, x) + Math.pow(y, y));
        System.out.println("Result: " + distance);


    }

    public static void main(String[] args) {
        Distance obj = new Distance();
        obj.distance();
    }
}

//**OR**//
class Distance2 {
    public static void main(String[] args) {


        // parse x- and y-coordinates from command-line arguments
        int x = 0;
        int y = 1;

        // compute distance to (0, 0)
        double dist = Math.sqrt(x * x + y * y);    ///Math.sqrt() function returns the square root of a number

        // output distance
        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
    }
}