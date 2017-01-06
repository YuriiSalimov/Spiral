package com.salimov.yurii;

/**
 * The class describes a method for getting
 * a spirally twisted array of digits.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 * @see ISpiral
 */
public class Spiral implements ISpiral {

    /**
     * The array of digits.
     */
    private final int[][] array;

    /**
     * The x coordinate.
     */
    private int coordinateX;

    /**
     * The y coordinate.
     */
    private int coordinateY;

    /**
     * The consistent value.
     */
    private int counter;

    /**
     * The value, if the array is ready for use.
     */
    private boolean isReady;

    /**
     * Constructor.
     *
     * @param length a array length (number of digits).
     */
    public Spiral(final int length) {
        int arrayLength = length > 0 ? length : 0;
        this.array = new int[arrayLength][arrayLength];
    }

    /**
     * Returns a spirally twisted array of digits.
     *
     * @return The spirally twisted array of digits.
     */
    @Override
    public int[][] getArray() {
        if (!this.isReady) {
            calculate();
            this.isReady = true;
        }
        return this.array;
    }

    /**
     * Calculates a spirally twisted array of digits.
     */
    private void calculate() {
        this.counter = 1;
        this.coordinateX = -1;
        this.coordinateY = -1;
        while (counter <= this.array.length * this.array.length) {
            nextY();
            nextX();
            previousY();
            previousX();
        }
    }

    /**
     * Initialize the array by increment y coordinate.
     */
    private void nextY() {
        this.coordinateX++;
        this.coordinateY++;
        while (this.coordinateY < this.array.length && this.array[this.coordinateX][this.coordinateY] == 0) {
            this.array[this.coordinateX][this.coordinateY++] = this.counter++;
        }
    }

    /**
     * Initialize the array by increment x coordinate.
     */
    private void nextX() {
        this.coordinateY--;
        this.coordinateX++;
        while (this.coordinateX < this.array.length && array[this.coordinateX][this.coordinateY] == 0) {
            this.array[this.coordinateX++][this.coordinateY] = this.counter++;
        }
    }

    /**
     * Initialize the array by decrement y coordinate.
     */
    private void previousY() {
        this.coordinateY--;
        this.coordinateX--;
        while (this.coordinateY >= 0 && this.array[this.coordinateX][this.coordinateY] == 0) {
            this.array[this.coordinateX][this.coordinateY--] = this.counter++;
        }
    }

    /**
     * Initialize the array by decrement x coordinate.
     */
    private void previousX() {
        this.coordinateY++;
        this.coordinateX--;
        while (this.coordinateX >= 0 && this.array[this.coordinateX][this.coordinateY] == 0) {
            this.array[this.coordinateX--][this.coordinateY] = this.counter++;
        }
    }
}
