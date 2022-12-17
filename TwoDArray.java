package assignment5.functionalprograms;


//1. 2D Array
//a. Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from
//standard input and printing them out to standard output.
//b. I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
//c. Logic -> create 2 dimensional array in memory to read in M rows and N cols
//d. O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with
//OutputStreamWriter to print the output to the screen.

import java.util.Scanner;

public class TwoDArray {
    public static void array2d() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter row : ");
        int m = s.nextInt();
        System.out.println("Enter Column : ");
        int n = s.nextInt();

        int arr[][] = new int[m][n];

        System.out.println("Enter element");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        System.out.println("Array : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();


        }
    }

    public static void main(String[] args) {

        array2d();
    }
}
