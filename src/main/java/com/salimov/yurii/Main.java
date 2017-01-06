package com.salimov.yurii;

public class Main {

    public static void main(String[] args) {
        System.out.println("--- Spiral array ---");
        print(
                getSpiralArray(
                        new ScanLength(System.in).scan()
                )
        );
    }

    private static int[][] getSpiralArray(final int length) {
        return new Spiral(length).getArray();
    }

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
