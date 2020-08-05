package ru.netology.stats;

public class StatsService<sum> {

    public int calculateSum(int[] sumAll) {

        int sum = 0;
        for (int item : sumAll){
            sum += item;

        }
        return sum;
    }

    public int calculateMediumSum(int[] medium) {
        int sum = 0;
        for (int item : medium) {
            sum = sum + item;

        }
        return sum / 12;
    }


