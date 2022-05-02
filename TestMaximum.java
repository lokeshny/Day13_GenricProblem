
/*
 * The Generics program implements Test cases that simply
 * finds Maximum of 3 variables using Generics.
 * @author: Lokesh
 * @date: 01-05-2022
 */

package com.BridgeLab.Genrics;

public class TestMaximum <T extends Comparable<T>>{
    private T x, y, z;

    // constructor test maximum
    public TestMaximum(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /*
     * testMaximum method extends comparable T to extend the max method to take more than three parameters
     */
    public static<T extends Comparable<T>> T testMaximum(T...values){
        T max = values[0];
        for(T element : values){
            if(element.compareTo(max)>0){
                max = element;
            }
        }
        printMax(max);
        return max;
    }

    /*
     *  printMax method created for displaying maximum values from more than three parameters
     */
    public static <T> void printMax(T max, T... values) {
        for (T element : values) {
            System.out.print(element+ "\t");
        }
        System.out.print("\n The maximum value is: " + max + "\n");
    }
}
