package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] sumAll) {

        int sum = 0;
        for (int item : sumAll) {
            sum += item;

        }
        return sum;
    }

    public float calculateMediumSum(int[] sales) {
        float sum = 0;
        for (float item : sales) {
            sum = sum + item;

        }
        return sum / sales.length;
    }




    public int calculateAmountMax(int[] sales) {
        int amount = 0;
        int mediumSum = 15;
        int i = 0;
        for (int item : sales) {
            if (item > mediumSum)
                i = i + 1;
        }
        return i;

    }


    public int calculateAmountMin(int[] sales) {
        int amount = 0;
        int mediumSum = 15;
        int i = 0;
        for (int item : sales) {
            if (item < mediumSum)
                i = i + 1;
        }
        return i;

    }


    public int findMin(int[] sales) {
        int monthMin = sales[0];
        int month = 0;
        int count = 0;
        for (int item : sales) {
            count++;
            if (monthMin >= item) {
                monthMin = item;
                month = count;

            }
        }
        return month;
    }
    public int findMax(int[] sales) {
        int monthMax = sales[0];
        int month = 0;
        int count = 0;
        for (int item : sales) {
            count++;
            if (monthMax <= item) {
                monthMax = item;
                month = count;

            }
        }
        return month;
    }
}


