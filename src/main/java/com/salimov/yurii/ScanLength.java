package com.salimov.yurii;

import java.io.InputStream;
import java.util.Scanner;

public final class ScanLength implements IScanLength {

    private final InputStream stream;

    public ScanLength(final InputStream stream) {
        this.stream = stream;
    }

    public int scan() {
        int length;
        try (final Scanner scanner = new Scanner(this.stream)) {
            while (true) {
                System.out.print("Input length = ");
                length = scanner.nextInt();
                if (length > 0) {
                    break;
                } else {
                    System.out.println(
                            "Incorrect input value! " +
                                    "Value must be greater than zero. " +
                                    "Try again..."
                    );
                }
            }
        } catch (NullPointerException ex) {
            ex.printStackTrace();
            length = 0;
        }
        return length;
    }
}
