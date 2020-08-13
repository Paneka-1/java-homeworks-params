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

        float actual = service.calculateMediumSum(sales);
        float expected = 15;
        assertEquals(expected, actual);


}
    @org.junit.jupiter.api.Test
    void findMin() {
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int expected = 9;
        int actual = service.findMin(sales);
        assertEquals(expected, actual);


    }
    @org.junit.jupiter.api.Test
    void findMax() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int expected = 8;
        int actual = service.findMax(sales);
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

    @org.junit.jupiter.api.Test
    void calculateAmountMin() {
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.calculateAmountMin(sales);
        assertEquals(expected, actual);



    }
}