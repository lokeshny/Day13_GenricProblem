
/*
 * The Generics program implements Test cases that simply
 * finds Maximum of 3 variables using Generics.
 * Master - Given 3 Float. find the maximum
 * @author: Lokesh
 * @date: 01-04-2022
 */

package com.BridgeLab.Genrics;
public class TestMaximum {
    String x, y, z;

    // constructor
    public TestMaximum(String x, String y, String z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /*
     * testMaximum method created for checking max of three Strings
     */
    public static String testMaximum(String x, String y, String z) {
        // Initializing x as greater
        String max = x;
        if (y.compareTo(max) > 0)
            // as of now y is greater
            max = y;

        if (z.compareTo(max) > 0)
            // now z is greater
            max = z;
        printMax(x,y,z,max);
        return max;

    }

    /*
     *  printMax method created for displaying maximum values from the given 3 variables.
     */
    public static void printMax(String x, String y, String z, String max) {
        System.out.printf("The max of %s, %s and %s is %s\n", x, y, z, max);

    }
}