// Java program to print the sum of series

import java.io.*;
import java.lang.*;

class gfgg {
    public static double sumOfSeries(double num) {
        double res = 0, fact = 1;
        for (int i = 1; i <= num; i++) {
            /* fact variable store factorial of the i. */
            fact = fact * i;

            res = res + (i / fact);
        }
        return (res);
    }

    public static void main(String[] args) {
        double n = 5;
        System.out.println("Sum: " + sumOfSeries(n));
    }
}

// Code contributed by Mohit Gupta_OMG <(0_o)>
