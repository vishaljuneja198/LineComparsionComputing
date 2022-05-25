//As a fan of geometry, I want to compare two lines based on the end points, So that I know one line is equal, greater or less than the other line. - Using Java compareTo method to compare 2 Lengths

package com.bridgelabz;
import java.lang.Math;

public class LineProblem {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");

        double x1 = 80.0, x2 = 26.0, y1 = 36.0, y2 = 87.0;
        double a = Math.sqrt(x2 - x1);
        double b = Math.sqrt(y2 - y1);

        System.out.println(a + " " + b);

        Double d1 = Double.valueOf(a);

        Double d2 = Double.valueOf(b);

        System.out.println("Are the Lengths equal : "+ d1.equals(d2));

        int check = d1.compareTo(d2);
        switch (check){
            case 1 :
                System.out.println("Line 1 is greater than Line 2");
                break;
            case -1 :
                System.out.println("Line 1 is smaller than Line 2");
                break;
            default :
                System.out.println("Both Lines are equal");
        }
    }
}
