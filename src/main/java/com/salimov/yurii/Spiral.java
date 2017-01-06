package com.salimov.yurii;

public class Spiral implements ISpiral {

    private final int[][] array;

    private int coordinateX;

    private int coordinateY;

    private int counter;

    private boolean isReady;

    public Spiral(final int length) {
        int arrayLength = length > 0 ? length : 0;
        this.array = new int[arrayLength][arrayLength];
    }

    @Override
    public int[][] getArray() {
        if (!this.isReady) {
            calculate();
            this.isReady = true;
        }
        return this.array;
    }

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

    private void nextY() {
        this.coordinateX++;
        this.coordinateY++;
        while (this.coordinateY < this.array.length && this.array[this.coordinateX][this.coordinateY] == 0) {
            this.array[this.coordinateX][this.coordinateY++] = this.counter++;
        }
    }

    private void nextX() {
        this.coordinateY--;
        this.coordinateX++;
        while (this.coordinateX < this.array.length && array[this.coordinateX][this.coordinateY] == 0) {
            this.array[this.coordinateX++][this.coordinateY] = this.counter++;
        }
    }

    private void previousY() {
        this.coordinateY--;
        this.coordinateX--;
        while (this.coordinateY >= 0 && this.array[this.coordinateX][this.coordinateY] == 0) {
            this.array[this.coordinateX][this.coordinateY--] = this.counter++;
        }
    }

    private void previousX() {
        this.coordinateY++;
        this.coordinateX--;
        while (this.coordinateX >= 0 && this.array[this.coordinateX][this.coordinateY] == 0) {
            this.array[this.coordinateX--][this.coordinateY] = this.counter++;
        }
    }
}
