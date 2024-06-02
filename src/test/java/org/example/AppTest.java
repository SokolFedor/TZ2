package org.example;

import org.junit.Test;

import java.util.*;
import java.math.BigInteger;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void test_min() {
        List<BigInteger> singleNumberList = Collections.singletonList(BigInteger.valueOf(1));
        assertEquals(BigInteger.valueOf(1), App._min(singleNumberList));

        List<BigInteger> singleNegativeNumberList = Collections.singletonList(BigInteger.valueOf(-1));
        assertEquals(BigInteger.valueOf(-1), App._min(singleNegativeNumberList));

        List<BigInteger> mixedNumbersList = Arrays.asList(
                BigInteger.valueOf(-23),
                BigInteger.valueOf(0),
                BigInteger.valueOf(-2),
                BigInteger.valueOf(3212),
                BigInteger.valueOf(4)
        );
        assertEquals(BigInteger.valueOf(-23), App._min(mixedNumbersList));

        List<BigInteger> negativeNumbersList = Arrays.asList(
                BigInteger.valueOf(-1),
                BigInteger.valueOf(-22),
                BigInteger.valueOf(-31),
                BigInteger.valueOf(-422),
                BigInteger.valueOf(-5)
        );
        assertEquals(BigInteger.valueOf(-422), App._min(negativeNumbersList));

        List<BigInteger> largeNumbersList = Arrays.asList(
                BigInteger.valueOf(Integer.MAX_VALUE),
                BigInteger.valueOf(Integer.MIN_VALUE),
                BigInteger.ZERO
        );
        assertEquals(BigInteger.valueOf(Integer.MIN_VALUE), App._min(largeNumbersList));

        List<BigInteger> sortedNumbersList = Arrays.asList(
                BigInteger.valueOf(1),
                BigInteger.valueOf(2),
                BigInteger.valueOf(3),
                BigInteger.valueOf(4)
        );
        assertEquals(BigInteger.valueOf(1), App._min(sortedNumbersList));

        List<BigInteger> reversedSortedNumbersList = Arrays.asList(
                BigInteger.valueOf(4),
                BigInteger.valueOf(3),
                BigInteger.valueOf(2),
                BigInteger.valueOf(1)
        );
        assertEquals(BigInteger.valueOf(1), App._min(reversedSortedNumbersList));
    }


    @Test
    public void test_max() {
        List<BigInteger> singleNumberList = Collections.singletonList(BigInteger.valueOf(1));
        assertEquals(BigInteger.valueOf(1), App._max(singleNumberList));

        List<BigInteger> singleNegativeNumberList = Collections.singletonList(BigInteger.valueOf(-1));
        assertEquals(BigInteger.valueOf(-1), App._max(singleNegativeNumberList));

        List<BigInteger> mixedNumbersList = Arrays.asList(
                BigInteger.valueOf(-23),
                BigInteger.valueOf(0),
                BigInteger.valueOf(-2),
                BigInteger.valueOf(3212),
                BigInteger.valueOf(4)
        );
        assertEquals(BigInteger.valueOf(3212), App._max(mixedNumbersList));

        List<BigInteger> negativeNumbersList = Arrays.asList(
                BigInteger.valueOf(-1),
                BigInteger.valueOf(-22),
                BigInteger.valueOf(-31),
                BigInteger.valueOf(-422),
                BigInteger.valueOf(-5)
        );
        assertEquals(BigInteger.valueOf(-1), App._max(negativeNumbersList));

        List<BigInteger> largeNumbersList = Arrays.asList(
                BigInteger.valueOf(Integer.MAX_VALUE),
                BigInteger.valueOf(Integer.MIN_VALUE),
                BigInteger.ZERO
        );
        assertEquals(BigInteger.valueOf(Integer.MAX_VALUE), App._max(largeNumbersList));

        List<BigInteger> sortedNumbersList = Arrays.asList(
                BigInteger.valueOf(1),
                BigInteger.valueOf(2),
                BigInteger.valueOf(3),
                BigInteger.valueOf(4)
        );
        assertEquals(BigInteger.valueOf(4), App._max(sortedNumbersList));

        List<BigInteger> reversedSortedNumbersList = Arrays.asList(
                BigInteger.valueOf(4),
                BigInteger.valueOf(3),
                BigInteger.valueOf(2),
                BigInteger.valueOf(1)
        );
        assertEquals(BigInteger.valueOf(4), App._max(reversedSortedNumbersList));
    }

    @Test
    public void test_sum() {
        List<BigInteger> singleNumberList = Collections.singletonList(BigInteger.valueOf(1));
        assertEquals(BigInteger.valueOf(1), App._sum(singleNumberList));

        List<BigInteger> singleNegativeNumberList = Collections.singletonList(BigInteger.valueOf(-1));
        assertEquals(BigInteger.valueOf(-1), App._sum(singleNegativeNumberList));

        List<BigInteger> mixedNumbersList = Arrays.asList(
                BigInteger.valueOf(-23),
                BigInteger.valueOf(0),
                BigInteger.valueOf(-2),
                BigInteger.valueOf(3212),
                BigInteger.valueOf(4)
        );
        assertEquals(BigInteger.valueOf(3191), App._sum(mixedNumbersList));

        List<BigInteger> negativeNumbersList = Arrays.asList(
                BigInteger.valueOf(-1),
                BigInteger.valueOf(-22),
                BigInteger.valueOf(-31),
                BigInteger.valueOf(-422),
                BigInteger.valueOf(-5)
        );
        assertEquals(BigInteger.valueOf(-481), App._sum(negativeNumbersList));


        List<BigInteger> sortedNumbersList = Arrays.asList(
                BigInteger.valueOf(1),
                BigInteger.valueOf(2),
                BigInteger.valueOf(3),
                BigInteger.valueOf(4)
        );
        assertEquals(BigInteger.valueOf(10), App._sum(sortedNumbersList));

        List<BigInteger> reversedSortedNumbersList = Arrays.asList(
                BigInteger.valueOf(4),
                BigInteger.valueOf(3),
                BigInteger.valueOf(2),
                BigInteger.valueOf(1)
        );
        assertEquals(BigInteger.valueOf(10), App._sum(reversedSortedNumbersList));
    }

    @Test
    public void test_mult() {
        List<BigInteger> singleNumberList = Collections.singletonList(BigInteger.valueOf(1));
        assertEquals(BigInteger.valueOf(1), App._mult(singleNumberList));

        List<BigInteger> singleNegativeNumberList = Collections.singletonList(BigInteger.valueOf(-1));
        assertEquals(BigInteger.valueOf(-1), App._mult(singleNegativeNumberList));

        List<BigInteger> mixedNumbersList = Arrays.asList(
                BigInteger.valueOf(-23),
                BigInteger.valueOf(0),
                BigInteger.valueOf(-2),
                BigInteger.valueOf(3212),
                BigInteger.valueOf(4)
        );
        assertEquals(BigInteger.valueOf(0), App._mult(mixedNumbersList));

        List<BigInteger> negativeNumbersList = Arrays.asList(
                BigInteger.valueOf(-1),
                BigInteger.valueOf(-22),
                BigInteger.valueOf(-31),
                BigInteger.valueOf(-422),
                BigInteger.valueOf(-5)
        );
        assertEquals(BigInteger.valueOf(-1439020), App._mult(negativeNumbersList));


        List<BigInteger> sortedNumbersList = Arrays.asList(
                BigInteger.valueOf(1),
                BigInteger.valueOf(2),
                BigInteger.valueOf(3),
                BigInteger.valueOf(4)
        );
        assertEquals(BigInteger.valueOf(24), App._mult(sortedNumbersList));

        List<BigInteger> reversedSortedNumbersList = Arrays.asList(
                BigInteger.valueOf(4),
                BigInteger.valueOf(3),
                BigInteger.valueOf(2),
                BigInteger.valueOf(1)
        );
        assertEquals(BigInteger.valueOf(24), App._mult(reversedSortedNumbersList));
    }
}
