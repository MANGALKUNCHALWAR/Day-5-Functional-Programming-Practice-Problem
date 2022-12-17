package assignment5.functionalprograms;

import java.util.Scanner;

//4. Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
//Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
//can be found using a formula (Note: Take a, b and c as input values)
//delta = b*b - 4*a*c
//Root 1 of x = (-b + sqrt(delta))/(2*a)
//Root 2 of x = (-b - sqrt(delta))/(2*a)
public class QuadraticEq {
    public static void quad() {
        int delta;
        double deltasqrt;
        double root1;
        double root2;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of a:");
        int a = s.nextInt();
        System.out.print("Enter value of b:");
        int b = s.nextInt();
        System.out.print("Enter value of c:");
        int c = s.nextInt();


        System.out.println("Quadratic Equation : " + a + "*x*x + " + b + "*x + " + c);
        delta = (b * b) - (4 * a * c);
        deltasqrt = Math.sqrt(delta);
        System.out.println();
        // System.out.println(delta);
        // System.out.println(deltasqrt);


        root1 = (-b + deltasqrt) / (2 * a);
        System.out.println("Root1 of x : " + root1);
        root2 = (-b - deltasqrt) / (2 * a);
        System.out.println("Root2 of x : " + root2);


    }

    public static void main(String[] args) {
        quad();
    }
}
