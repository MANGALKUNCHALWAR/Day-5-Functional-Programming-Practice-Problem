package assignment5.functionalprograms;

import java.util.Scanner;

//3. Write a program Distance.java that takes two integer command-line arguments x
//and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
//formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
public class Distance {
    public void distance()
    {
        double distance;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of x");
        int x = s.nextInt();
        System.out.println("Enter value of y");
        int y = s.nextInt();


        distance=Math.sqrt(Math.pow(x,x)+Math.pow(y,y));
        System.out.println("Result: "+distance);


    }

    public static void main(String[] args) {
        Distance obj = new Distance();
        obj.distance();
    }
}
