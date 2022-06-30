package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    long[] sales = {
            8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
    };
    StatsService service = new StatsService();

    @Test
    public void shouldFindMinMonth() {
        int expectedMinMonth = 9;
        int actualMinMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void shouldFindMaxMonth() {
        int expectedMaxMonth = 8;
        int actualMaxMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void shouldFindSumSales() {
        int expectedSum = 180;
        long actualSum = service.sumSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindAverageSales() {
        int expectedAverageSum = 15;
        float actualAverageSum = service.averageSales(sales);
        Assertions.assertEquals(expectedAverageSum, actualAverageSum);
    }

    @Test
    public void shouldFindLessThanAverage() {
        int expectedLessThanAverage = 5;
        int actualLessThanAverage = service.lessThanAverage(sales);
        Assertions.assertEquals(expectedLessThanAverage, actualLessThanAverage);
    }

    @Test
    public void shouldFindAboveAverage() {
        int expectedAboveAverage = 5;
        int actualAboveAverage = service.aboveAverage(sales);
        Assertions.assertEquals(expectedAboveAverage, actualAboveAverage);
    }

}
