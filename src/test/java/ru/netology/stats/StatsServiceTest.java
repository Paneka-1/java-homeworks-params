package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void calculateSum() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.calculateSum(sales);
        int expected = 180;
        assertEquals(expected, actual);

    }
    @org.junit.jupiter.api.Test
    void calculateMediumSum() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.calculateMediumSum(sales);
        int expected = 15;
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void findMax() {
        StatsService service = new StatsService();

        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.findMax(sales);
        assertEquals(expected, actual);

    }
}