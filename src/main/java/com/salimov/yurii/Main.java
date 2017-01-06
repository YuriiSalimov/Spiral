package com.salimov.yurii;

/**
 * The main class of the app.
 *
 * @author Yurii Salimov (yurii.alex.salimov@gmail.com)
 * @version 1.0
 * @see Spiral
 */
public class Main {

    /**
     * The main method.
     *
     * @param args a input arguments.
     */
    public static void main(String[] args) {
        System.out.println("--- Spiral array ---");
        print(
                getSpiralArray(
                        new ScanLength(System.in).scan()
                )
        );
    }

    /**
     * Returns a spirally twisted array of digits.
     *
     * @param length a array length (number of digits).
     * @return The spiral array.
     */
    private static int[][] getSpiralArray(final int length) {
        return new Spiral(length).getArray();
    }

    /**
     * Prints the array in console.
     *
     * @param array a array to print.
     */
    private static void print(int[][] array) {
        System.out.println("Result Spiral:");
        for (int[] anArray : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(anArray[j] + " ");
            }
            System.out.println();
        }
    }
}
