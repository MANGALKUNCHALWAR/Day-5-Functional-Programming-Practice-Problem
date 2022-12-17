package assignment5.functionalprograms;

// 2)Sum of three Integer adds to ZERO
// a. Desc -> A program with cubic running time. Read in N integers and counts the
// number of triples that sum to exactly 0.
//  b. I/P -> N number of integer, and N integer input array
// c. Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
//d. O/P -> One Output is number of distinct triplets as well as the second output is to
// print the distinct triplets.

import java.util.Scanner;

public class SumZero {
    public static void triplets(int arr[], int n)  //n=array length
    {
        boolean found = false;
        for(int i = 0 ; i<n-2 ; i++)
        {
            for(int j=i+1; j<n-1; j++)
            {
                for(int k=j+1; k<n;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==0)
                    {
                        System.out.println(arr[i]+ " "+arr[j]+" "+arr[k]);
                        found=true;
                    }

                }
            }
        }
        if(found==false)
        {
            System.out.println("not exixt");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array length");
        int n=s.nextInt();

        int arr[]= new int[n];
        System.out.println("Enter element in array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();

        }
        for(int i=0 ; i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Numbers sum is Zero:");
        triplets(arr,n);

    }

}
