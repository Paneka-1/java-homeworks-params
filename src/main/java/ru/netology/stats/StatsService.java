package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] sumAll) {

        int sum = 0;
        for (int item : sumAll) {
            sum += item;

        }
        return sum;
    }

    public int calculateMediumSum(int[] sales) {
        int sum = 0;
        for (int item : sales) {
            sum = sum + item;

        }
        return sum / sales.length;
    }


    public int findMax(int[] sales) {

        int maxNumber = sales[0];
        int currentMax = 20;
        int i;
        for (i = 0; i < sales.length; i++) {
            currentMax = Math.max(maxNumber, sales[i]);
        }

        return maxNumber;
    }

    public int findMin(int[] sales) {

        int minNumber = sales[0];
        int currentMax = 1;
        int i;
        for (i = 0; i > sales.length; i++) {
            currentMax = Math.min(minNumber, sales[i]);
        }

        return minNumber;
    }


    public int calculateAmount(int[] sales) {
        int amount = 0;
        int currentMin = 15;
        int i = 0;
        for (int item : sales) {
            if (item < currentMin)
                i = i + 1;
        }
        return i;

    }


    public int calculateAmountMax(int[] sales) {
        int amount = 0;
        int currentMax = 15;
        int count = 0;
        for (int item : sales) {
            count++;

            if (item > currentMax)
                amount = count;
            }
        return amount;
    }

}



