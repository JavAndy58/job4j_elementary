package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00To20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        int expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00To40Then4() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 4;
        int y2 = 0;
        int expected = 4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when40To80Then4() {
        int x1 = 4;
        int y1 = 0;
        int x2 = 8;
        int y2 = 0;
        int expected = 4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test

    public void when00To08Then8() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 8;
        int expected = 8;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
