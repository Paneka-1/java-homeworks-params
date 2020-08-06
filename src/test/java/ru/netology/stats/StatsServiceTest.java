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
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int expected = 8;
        int actual = service.findMax(new int[]{8});
        assertEquals(expected, actual);

}
    @org.junit.jupiter.api.Test
    void findMin() {
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int expected = 1;
        int actual = service.findMin(new int[]{1});
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void calculateAmount() {
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.calculateAmount(sales);
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void calculateAmountMax() {
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.calculateAmountMax(sales);
        assertEquals(expected, actual);

    }

}