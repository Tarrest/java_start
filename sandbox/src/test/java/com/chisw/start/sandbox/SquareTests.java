package com.chisw.start.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {

    @Test
    public void testSquare() {
        Square s = new Square(10);
        Assert.assertEquals(s.area(), 100.0);
    }

}
