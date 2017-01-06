package com.salimov.yurii;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class SpiralTest {

    @Test
    public void whenCreateSpiralWithNegativeLengthThenSetZero() {
        final ISpiral spiral = new Spiral(-10);
        assertEquals(spiral.getArray().length, 0);
    }

    @Test
    public void whenCreateSpiralWithPositiveLengthThenSetIt() {
        final ISpiral spiral = new Spiral(10);
        assertEquals(spiral.getArray().length, 10);
    }
}
