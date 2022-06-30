package ru.netology.stats;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public long sumSales(long[] sales) {
        long sum = 0; // переменная для суммы продаж
        for (long sale : sales) {
            // sale - продажи в рассматриваемом месяце
            sum = sum + sale;
        }
        return sum;
    }

    public float averageSales(long[] sales) {
        float averageSum = sumSales(sales) / sales.length;
        return averageSum;
    }

    public int lessThanAverage(long[] sales) {
        float averageSum = averageSales(sales);
        int sumMonth = 0; // переменная для кол-во месяцев
        for (long sale : sales) {
            // sale - продажи в рассматриваемом месяце
            if (sale < averageSum) {
                sumMonth = sumMonth + 1;
            }
        }
        return sumMonth;
    }

    public int aboveAverage(long[] sales) {
        float averageSum = averageSales(sales);
        int sumMonth = 0; // переменная для кол-во месяцев
        for (long sale : sales) {
            // sale - продажи в рассматриваемом месяце
            if (sale > averageSum) {
                sumMonth = sumMonth + 1;
            }
        }
        return sumMonth;
    }

}
