package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MinTest {
    @Test
    public void whenFirstMin() {
        int[] array = new int[]{0, 5, 10};
        int result = Min.findMin(array);
        int expect = 0;
        Assert.assertEquals(expect, result);
    }

    @Test
    public void whenLastMin() {
        int[] array = new int[]{10, 5, 3};
        int result = Min.findMin(array);
        int expect = 3;
        Assert.assertEquals(expect, result);
    }

    @Test
    public void whenMidletMin() {
        int[] array = new int[] {10, 2, 5};
        int result = Min.findMin(array);
        int expect = 2;
        Assert.assertEquals(expect, result);
    }
}
